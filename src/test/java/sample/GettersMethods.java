package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettersMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.linkText("Register"));
		
		//fetch the text if the element
		System.out.println(register.getText());
		
		//fetch the attribute value
		System.out.println(register.getAttribute("class"));
		
		//fetch the tagname
		System.out.println(register.getTagName());
		
		//fetch the size
		System.out.println(register.getSize());
		
		//fetch the location
		System.out.println(register.getLocation());
		
		//fetch the rect
		System.out.println(register.getRect().getX());
		
		//get  css value
		System.out.println(register.getCssValue("flout"));
		
	}

}
