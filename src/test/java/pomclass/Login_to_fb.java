package pomclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_Utility.LoginPomPage;

public class Login_to_fb {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		FileInputStream fis=new FileInputStream("./src/test/resources/Facebook loginpage");
		Properties p=new Properties();
		p.load(fis);
		
		String URL=p.getProperty("url");
		String 	UN=p.getProperty("username");
		String PSWD=p.getProperty("password");
	
	
	LoginPomPage l=new LoginPomPage(driver);
	driver.get(URL);
	
	//Verifiaction
	if(l.getHeader().contains("Facebook helps you")) {
		l.getUn().sendKeys(UN);
		l.getPwd(PSWD);
		
		driver.navigate().refresh();
		
		l.getUn().sendKeys(UN);
		l.getPwd(PSWD);
		l.getLogin_btn();
		
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("sele");
		driver.navigate().refresh();
		user.sendKeys("sele");
	    driver.quit();
	
	}
	}
}
