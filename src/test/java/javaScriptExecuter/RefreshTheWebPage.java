package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshTheWebPage {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//type casting
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//navigate to an application
		js.executeScript("window.location=arguments[0]","https://www.facebook.com/");
        
		//fetch the title of the web page
		System.out.println("Title : "+js.executeScript("return document.title"));
		
		//fetch the Url
		System.out.println("Url: "+js.executeScript("return document.URL"));
		
		//Refresh the web page
		js.executeScript("history.go(0)");
		
		//close the browser
		driver.quit();

	}
}
