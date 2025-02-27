package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ByIndex {

	public static void main(String[] args) throws InterruptedException {

     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.snapdeal.com/");
     
     WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'accountUserName')]"));
     Actions act=new Actions(driver);
     act.moveToElement(ele).perform();
     
     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[text()='login']")).click();
     
     //switch to frame by index
    // driver.switchTo().frame(0);
     //switch to frame by using web element
     WebElement frme = driver.findElement(By.id("loginIframe"));  
     driver.switchTo().frame(frme);
     driver.findElement(By.id("userName")).sendKeys("996767677");
     Thread.sleep(3000);
     driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-delete-sign fnt-22')]")).click();
     driver.switchTo().defaultContent();
    
     WebElement frmes = driver.findElement(By.id("inputValEnter"));
     frmes.sendKeys("toys");
     Thread.sleep(3000);
     frmes.click();
     Thread.sleep(3000);
	}
}
