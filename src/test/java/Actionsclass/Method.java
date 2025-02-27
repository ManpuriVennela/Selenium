package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method {

	public static void main(String[] args) {
		
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an application
						driver.get("https://testkru.com/Interactions/DragAndDrop");
						//finding the element
						WebElement drag=driver.findElement(By.id("box1"));
						WebElement targetloc=driver.findElement(By.id("dropZone1"));
						WebElement drag1=driver.findElement(By.id("box3"));
						WebElement drop1=driver.findElement(By.xpath("//div[text()='Drop Zone 3']"));
						WebElement drag2=driver.findElement(By.id("box2"));
						WebElement drop2=driver.findElement(By.id("dropZone2"));
						Actions act=new Actions(driver);
						act.dragAndDrop(drag,targetloc).perform();
						act.scrollToElement(drop1).perform();
						act.dragAndDrop(drag1,drop1).perform();  
						act.dragAndDrop(drag2,drop1).perform();
	}
}
