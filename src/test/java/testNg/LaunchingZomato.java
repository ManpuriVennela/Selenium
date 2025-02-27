package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchingZomato {
	@Parameters ("BROWSER")
	@Test 
	public void launchzomato(String browser)
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
	driver.get("https://www.zomato.com/");
	}
	}

