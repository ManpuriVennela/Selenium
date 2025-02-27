package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to the application
				driver.get("https://www.flipkart.com/");
				
				//identify search textfield
		  		//driver.findElement(By.name("q")).sendKeys("mobile"+Keys.ENTER);
		  		
		  		//scroll the web page based on coordinates
		  		Actions act=new Actions(driver);
		  		act.scrollByAmount(100,2000).perform();
		  		
		  		//scroll the webpage based on webpage
		  		WebElement ele=driver.findElement(By.xpath("//a[text()='Cleartrip']"));
                act.scrollToElement(ele).moveToElement(ele).click().build().perform();	
	
	            //close the broswer
                driver.quit();
	}

}
