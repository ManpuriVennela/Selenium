package takeScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfAWebElement {

	public static void main(String[] args) throws IOException {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximize the window
				driver.manage().window().maximize();
				   
				//implicitly wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate to an application
				driver.get("https://www.swiggy.com/");
				
				WebElement icon=driver.findElement(By.xpath("//img[@loading='lazy']"));
				
				
				//Screenshot of web element
				File temp=icon.getScreenshotAs(OutputType.FILE);
				File newfile=new File("./screenshot/element.png");
				FileUtils.copyFile(temp, newfile);
				
				//close the browser
				driver.quit();
				
				

	}

}
