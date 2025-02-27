package Scenario;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assingment2 {

	public static void main(String[] args) throws InterruptedException {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the webpage
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//navigate to anapplication
		driver.get("https://www.ajio.com/");
		//finding an element
		WebElement Beauty = driver.findElement(By.xpath("//a[@title='WOMEN']"));
		Actions act= new Actions(driver);
		act.moveToElement(Beauty).perform();
		Thread.sleep(3500);
		driver.findElement(By.xpath("//a[text()='Dress Material']")).click();
		WebElement sortBy = driver.findElement(By.id("sortBy"));
        Select s=new Select(sortBy);
        s.selectByIndex(3);       
        Thread.sleep(3600);
        WebElement price = driver.findElement(By.xpath("//div[text()='Women Embroidered 3-Piece Unstitched Dress Material']/../..//div//div[3]//span[@class='price  ']"));
	    System.out.println(price.getText());
	    Thread.sleep(3800);
	    
	    driver.quit();

	}

}
