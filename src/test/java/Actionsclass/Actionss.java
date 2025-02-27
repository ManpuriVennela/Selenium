package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		//navigate to an application
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//finding the element
		WebElement rightclk=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclk).perform();
		
		act.click(rightclk).perform();
		
		Thread.sleep(3000);
		
		WebElement doubleclk=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(doubleclk).perform();
		
		//close the browser
		//driver.quit();
		
	}

}
