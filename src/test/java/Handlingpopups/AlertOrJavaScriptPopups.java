package Handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertOrJavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//click on alert pop up button
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
	
		//switch the driver control to the alert popup
	    Alert al = driver.switchTo().alert();
	    System.out.println(al.getText());
	    al.accept();
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    
	    //driver.switchTo().alert().accept();
	    System.out.println(driver.findElement(By.id("result")).getText());
	    
	    
	    
	}

}
