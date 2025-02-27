package Scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.meesho.com/");
		
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		
		WebElement trck = driver.findElement(By.xpath("//p[text()='Track Pants']"));
			    trck.click();
			    
			    //driver.findElement(By.xpath("//h5[text()='308']"));

	}

}
