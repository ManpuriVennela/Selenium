package Assertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsts {

	@Test
	public void St()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();
	  
		SoftAssert soft=new SoftAssert();
	    soft.assertEquals(title, "Facebook – log in or sign up");
	    System.out.println("verification passed");
	     
	    soft.assertAll();
	    driver.quit();
	}
    }
