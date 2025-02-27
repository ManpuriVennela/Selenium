package Handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert al=driver.switchTo().alert();
        
        //entering text into the popup
        al.sendKeys("selenium");
        Thread.sleep(3000);
        //clicking on ok button
        al.accept();
        //fetcing result 
        WebElement result=driver.findElement(By.id("result")); 
        System.out.println(result.getText());
	}

}
