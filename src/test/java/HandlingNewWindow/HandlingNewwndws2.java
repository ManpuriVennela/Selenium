package HandlingNewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNewwndws2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		//create a new empty window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(2000);
		
		//create a new tab
		driver.switchTo().newWindow(WindowType.TAB);

	}

}
