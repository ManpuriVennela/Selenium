package Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBackDataToExcelFile {

	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    FileInputStream fis=new FileInputStream("./src/test/resources/Automation1.xlsx");
    
   Workbook wb= WorkbookFactory.create(fis);
   
   Sheet sh=wb.getSheet("Sheet1");
   Row r = sh.createRow(6);
   //create cell
   Cell c = r.createCell(1);
   //create cell values
   c.setCellValue("selenium");
   c.setCellValue("oneplusnord");
   
   FileOutputStream fos=new FileOutputStream("./src/test/resources/Automation1.xlsx");
   wb.write(fos);
   wb.close();
   


	}

}
