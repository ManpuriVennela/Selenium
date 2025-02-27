package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
 //changes done in git hub
	@Test 
	public void hA()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		
		String title = driver.getTitle();
		
		//hard assert
		Assert.assertEquals(title,"Facebook – log in or sign up" );
		
		//Assert.fail();
		System.out.println("verification passed");
	   
		boolean condition=driver.getTitle().contains("Facebook – log in or sign up");
		
		Assert.assertTrue(condition);
	    driver.quit();
	}	
}
