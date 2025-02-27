package optims;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://www.shoppersstack.com/");
	       
	       WebElement mens = driver.findElement(By.id("men"));
	       
	       Actions act=new Actions(driver);
	       Thread.sleep(3000);
	       act.moveToElement(mens).perform();
	       
	       driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
	          WebElement tshirts = driver.findElement(By.xpath("//span[text()='puma']"));
             tshirts.click();
	          
	
	}

}
