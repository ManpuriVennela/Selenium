package Actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an application
						driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
						//finding the element
						WebElement clk=driver.findElement(By.name("A"));
						
						Actions act=new Actions(driver);
                        act.clickAndHold(clk).perform();
                        
                        WebElement share=driver.findElement(By.xpath("//button[@aria-label='Share'])[2]"));
	                    act.moveToElement(share).perform();
	                
	                
	                act.release(clk).perform();
	}

}
