package Handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HnadlingNotificationPopups {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(3000);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-geolocation");
		
		driver.get("https://the-internet.herokuapp.com/geolocation");
	    driver.findElement(By.xpath("//button[text()='Where am I?']")).click();
	}

}
