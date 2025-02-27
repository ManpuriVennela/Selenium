package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		//maximize browser
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate url
				driver.get("https://www.google.com/");
				
				//identifying search text field
				driver.findElement(By.id("APjFqb")).sendKeys("sele");
				
				//fetch all autosuggestions 
				
				List<WebElement> sugg=driver.findElements(By.xpath("//span[contains(text(),'sele')]"));
				for(WebElement ele:sugg){
				System.out.println(ele.getText());
	}
				
				//click on any one of the auto suggestions
				driver.findElement(By.xpath("(//span[contains(text(),'sele')])[3]")).click();
			
				Thread.sleep(200);
			driver.quit();
	               }

}
