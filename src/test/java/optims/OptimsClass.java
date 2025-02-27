package optims;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptimsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
	        
		//Thread.sleep(3000);
		
		String keyEnter;
		WebElement stf = driver.findElement(By.id("twotabsearchtextbox"));
                stf.sendKeys("Samsung");
                driver.findElement(By.id("nav-search-submit-button")).click();
                
                WebElement sortby = driver.findElement(By.xpath("//span[text()='Sort by:']"));
	                sortby.click();
	                
	            driver.findElement(By.id("s-result-sort-select_1")).click();
	            
	            
	            sortby.click();
	            driver.findElement(By.id("s-result-sort-select_2")).click();
	            driver.findElement(By.xpath("//div[@class='colorsprite aok-float-left']")).click();
	            
	
	}

}
