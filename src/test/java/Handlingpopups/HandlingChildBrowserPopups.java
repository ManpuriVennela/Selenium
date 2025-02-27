package Handlingpopups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserPopups {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobiles"+Keys.ENTER);
		
		//fetch the parent window id
		String str=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[text()='MOTOROLA g05 (Plum Red, 64 GB)']")).click();
		
		//fetching all the window ids
		Set<String>   wnd= driver.getWindowHandles();
		
		//iterating all the window ids
		for(String s:wnd) {
			//switch the driver control
			driver.switchTo().window(s);
			
			if(driver.getTitle().contains("MOTOROLA g05 (Plum Red, 64 GB)"))	{
				driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
			Thread.sleep(3000);
			}
	}
      //switcing back to the parent window
		driver.switchTo().window(str);
		driver.quit();
}
}
