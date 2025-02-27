package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		//launch te browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the web page
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.ajio.com/");
		
		//scroll the web page using hard coded coordinates
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,700)");
		
		//scroll the web page by using element reference
		WebElement ele=driver.findElement(By.xpath("//strong[text()='100% HANDPICKED']"));
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		//scroll webpage using element coordinates
		int x=ele.getLocation().getX();
		int y=ele.getLocation().getY();
		//js.executeScript("window.scrollBy("+x+","+y+")");
		//System.out.println(x+","+y);
		
		//Scroll till bottom of the web page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		
		//scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		
		//close the browser
		//driver.quit();
        
	}

}
