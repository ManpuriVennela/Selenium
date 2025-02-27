import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Streams {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		Properties p=new Properties();
		
		String URL=p.getProperty("url");
		String UN=p.getProperty("Username");
        String PWD=p.getProperty("password");
        String TIME= p.getProperty("timeoys");
        
        long time=Long.parseLong(TIME);
        
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("URL");
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(PWD);

	}

}
