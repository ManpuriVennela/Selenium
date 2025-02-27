package takeScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String [] args) throws IOException {
	    
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate to an application
		driver.get("https://www.swiggy.com/restaurants");
		
		//step 1:typecast takescreenshot (i) with driver reference variable
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//step2: take screenshot and store in temp file
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//step3:create an empty folder
		File dest=new File("./screenshot/swiggy.png");
		
		//step4: copy the screenshot in an empty folder
		FileUtils.copyFile(src, dest);
		 
		//close the browser
		driver.quit();
	}
}
