package pomclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Utility.LoginPomPage;
import pom_Utility.RegisterPompage;

public class Register_To_Qspiders {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis=new FileInputStream("./src/test/resources/Register.xlsx");
		
        Workbook wb=WorkbookFactory.create(fis);
		
		//fetch the sheet
		Sheet sh=wb.getSheet("Sheet1");
		
		Row r = sh.getRow(0);
		Cell c = r.getCell(1);
	   String data = c.getStringCellValue();
		
		System.out.println(data);
		//fetching multiple rows from excel
				for(int i=0;i<=sh.getLastRowNum();i++)
				{
					System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
				}
				
				Properties p=new Properties();				
				p.load(fis);
				
				String URL=p.getProperty("url");
				String 	UN=p.getProperty("name");
				String EMAIL=p.getProperty("email");
				String PSWD=p.getProperty("password");
			
			
			RegisterPompage l=new RegisterPompage(driver);
			driver.get(URL);
			
    l.getNme().sendKeys(UN);
    l.getEml(EMAIL);
    l.getPswd(PSWD);
    
	}
		}
	

