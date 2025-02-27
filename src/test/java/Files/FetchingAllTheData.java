package Files;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingAllTheData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Automation1.xlsx");
	             Workbook wb= WorkbookFactory.create(fis);
	             
	             Sheet sh=wb.getSheet("Sheet1");
	             for(int i=1;i<=sh.getLastRowNum();i++)
	     		{
	     			System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	     		    System.out.println(sh.getColumnStyle(i));
	     		}
	}

}
