package sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//navigate url
				driver.get("//https:demoapp.skillrary.com/");
				
				//identifying drop down
				WebElement multisdd=driver.findElement(By.id("cars"));
				Select s=new Select(multisdd);
				s.selectByValue("90");
				s.deselectByVisibleText("INR 200 - INR 299 ( 3 ) " );
				s.deselectByIndex(1);
				s.deselectByValue("INR 200 - INR 299 ( 3 ) ");
				s.deselectAll();
	}

}
