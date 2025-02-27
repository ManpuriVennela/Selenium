package Handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopups {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Hyder");
		
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		
		driver.findElement(By.id("toCity")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("beng");
		
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		
		driver.findElement(By.xpath("//p[@data-cy='departureDay']")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'February')]/../../descendant::p[text()='14']"));
		
		

	}

}
