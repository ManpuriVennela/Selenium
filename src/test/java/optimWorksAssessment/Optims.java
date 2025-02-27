package optimWorksAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Optims {

	public static void main(String[] args) throws InterruptedException {
		
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigating to an application
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	
		//handling frame
		WebElement frme = driver.findElement(By.id("webpush-onsite"));
		
		//switching to iframe
		driver.switchTo().frame(frme);
	    driver.findElement(By.id("deny")).click();
		
		Thread.sleep(10000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
		
		//driver.findElement(By.xpath("p[@class='One-way'")).click();
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//span[text()='From']")).click();
		Thread.sleep(3000);
		
	    WebElement txt = driver.findElement(By.xpath("//input[@type='text']"));
	    txt.sendKeys("Delhi(Del");
	    
		driver.findElement(By.xpath("//span[@class='autoCompleteTitle ']")).click();
		Thread.sleep(3000);

		//WebElement tto = driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[2]"));
		Thread.sleep(3000);
		//tto.sendKeys("hyderabad");
		
	    WebElement to = driver.findElement(By.xpath("//input[@type='text']"));
		to.sendKeys("Hyderabad");
		
		driver.findElement(By.xpath("//p[contains(text(),'Rajiv Gandhi International Airport')]")).click();
		
		driver.findElement(By.xpath("//div[@style='width: 142px;']")).click();
		
		driver.findElement(By.xpath("//div[@aria-label='Fri Feb 28 2025']")).click();
		
		driver.findElement(By.xpath("//p[text()='economy']")).click();
		
		driver.findElement(By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[2]")).click();
		
		//driver.findElement(By.xpath("(//span[@class='sc-12foipm-51 kZvHQU'])[4]")).click();
      
		WebElement child = driver.findElement(By.xpath("(//*[name()='svg'][@height='15'])[3]"));
		
		child.click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();
		
		//driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("depature_filter_text")).click();
		
		driver.findElement(By.xpath("//span[contains(@class,'filtersstyles__CheckBox-sc-1hyeel5-19 iUvfDk')]")).click();
		
		driver.findElement(By.xpath("(//span[contains(@class,'filtersstyles__CheckBox-sc-1hyeel5-19 iUvfDk')])[4]")).click();
		
		driver.quit();
	}

}
