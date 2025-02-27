package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DradandDrop {

	public static void main(String[] args) {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an application
						driver.get("https://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
						//finding the element
						WebElement drag=driver.findElement(By.id("box6"));
						WebElement drop=driver.findElement(By.id("box106"));
						
						WebElement drag1=driver.findElement(By.id("box5"));
						WebElement drop2=driver.findElement(By.id("box105"));
						
						Actions act=new Actions(driver);
						act.dragAndDrop(drag, drop).perform();
						
						act.dragAndDrop(drag1, drop2).perform();
						driver.quit();
								
				
		
		
		
	}

}
