package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationMethods {

	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demowebshop.tricentis.com/");
	WebElement searchTF=driver.findElement(By.id("small-searchterms"));
	
	//verify if element is dispalyed
	if (searchTF.isDisplayed()) {
		searchTF.sendKeys("books");
		}
		
		//verify if element is enabled
		WebElement searchbtn=driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		
		if(searchbtn.isEnabled());{
		searchbtn.click();
	}
		//verify if element is selected
		WebElement checkbox=driver.findElement(By.id("As"));
		checkbox.click();
		
		if (checkbox.isSelected());{
		System.out.println("check box is selected");
		}
	    }
}



