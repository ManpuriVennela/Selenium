package HandlingFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToZomatoByFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		//Switch to frame
		driver.switchTo().frame("auth-login-ui");
		
		//performing actions on frame
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("5565656657");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		//switch back to the main web page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("pastry");
        driver.quit();
	}

}
