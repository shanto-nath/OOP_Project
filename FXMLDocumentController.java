/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package pdfgeneration;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;

/**
 *
 * @author aquib
 */
public class FXMLDocumentController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void GeneratePDFButtonAction(ActionEvent event) {
        try{
           
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                doc.setRightMargin(70);
                //----------------------------------------------------
                //adding paragrapg to the pdf
                String newline = "\n";
                Paragraph lineSpace = new Paragraph(newline);
                lineSpace.setHeight(10);
                
                String paraText1 
                        = "Md. Aquib Azmain\n"
                        + "Adjunct Lecturer\n"
                        + "IUB, Dhaka\n";
                Paragraph para1 = new Paragraph(paraText1);
                
                Text titleText = new Text("This is the TITLE of the pdf");
                
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();    //OR titleText.setBold();

                PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
                Text title = new Text("System analysis and design").setFont(fontBold);
                Text author = new Text("Ross").setFont(font2);
                author.setFontColor(Color.RED);
                Paragraph bookInfo = new Paragraph().add(title).add("5th edition by ").add(author);
                
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(bookInfo);
                doc.add(lineSpace);
                
                //----------------------------------------------------
                
                //adding a list
                List contentgList = new List();
                contentgList.add("Usecase diagram");
                contentgList.add("Activity diagram");
                contentgList.add("Component diagram");
                contentgList.add("Dataflow diagram");          
                doc.add(contentgList);
                doc.add(lineSpace);
                
                //----------------------------------------------------
                //adding an image
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Do you want to add an Image?");
                Optional<ButtonType> result = a.showAndWait();
                if(result.get() == ButtonType.OK){ 
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);  
                    image.setAutoScale(true);
                    
                    doc.add(image);
                    doc.add(lineSpace);
                    a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("The image is added successfully.");
                    a.showAndWait();
                }
                //----------------------------------------------------
                
                //adding table in pdf
                float colWidthArr[] = {70f, 200f, 100f};
                Table pdfTable = new Table(colWidthArr); 
                
                //adding header row
                Cell cell_00 = new Cell(); 
                cell_00.add("Student ID");
                cell_00.setBackgroundColor(Color.YELLOW);
                pdfTable.addCell(cell_00);
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("Student Name"));
                pdfTable.addCell(new Cell().setBackgroundColor(Color.YELLOW).add("CGPA"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("101"));
                pdfTable.addCell(new Cell().add("Nafis"));
                pdfTable.addCell(new Cell().add("3.5"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("102"));
                pdfTable.addCell(new Cell().add("Arif"));
                pdfTable.addCell(new Cell().add("3.2"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("103"));
                pdfTable.addCell(new Cell().add("Anik"));
                pdfTable.addCell(new Cell().add("3.9"));

                doc.add(pdfTable);
                
                doc.close();
                
                a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("The PDF is saved successfully.");
                a.showAndWait();    
            }
            else{
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Saving as PDF: cancelled!");
                a.showAndWait();               
            }
        }
        catch(Exception e){
            
        }                           
    }

}
