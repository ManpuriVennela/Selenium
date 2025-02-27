package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	@Parameters ("BROWSER")
	@Test 
	public void launchfb(String browser)
	{
	WebDriver driver=null;
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}else
		{
			driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	}
	}


