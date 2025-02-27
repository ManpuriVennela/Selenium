package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) {
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to the application
		driver.get("https://www.myntra.com/");
		
		//find the element
		WebElement beauty=driver.findElement(By.xpath("//a[text()='Beauty']"));
		 
		Actions act=new Actions(driver);
		act.moveToElement(beauty).perform();
		
		beauty.click();
	}
}
