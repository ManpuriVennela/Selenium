import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shoppersstop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.shoppersstop.com/");
		
		WebElement women = driver.findElement(By.xpath("//a[text()='WOMEN']"));
		Actions act=new Actions(driver);
		act.moveToElement(women).perform();
		
		
		

	}

}
