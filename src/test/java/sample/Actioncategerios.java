package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actioncategerios {

	public static void main(String[] args) {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to the application
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify search textfield
  		WebElement srch=driver.findElement(By.tagName("input"));
  		
  		//enter inputs
  		srch.sendKeys("shoes");
  		
  		//clear text
  		srch.clear();
  		
  		//enter iput
  		srch.sendKeys("books");
  		
  		//identify search button
  		driver.findElement(By.xpath("//input[@type=\"submit\"]")).submit();
  		
  		//click on element
  		driver.findElement(By.linkText("Register")).click();
	}
}
