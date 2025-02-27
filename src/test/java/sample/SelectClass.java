package sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		
		//maximize browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//navigate url
		driver.get("https://www.amazon.com/");
		
		//identifying drop down
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		
		//create an instance of select class
		Select s=new Select(dropdown);
		
		//select option based on the index
		s.selectByIndex(7);
		
		//select option based on value
		s.selectByValue("search-alias=apparel");
		
		//select option by visible test
		s.selectByVisibleText("Luxury Beauty");
		
		//check whether the dd is single/multi select dd
		System.out.println(s.isMultiple());          
		
		//fETCH ALL THE OPTIONS
		List<WebElement> list=s.getOptions();
		
		for(WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
		
		//fetch the first selected option
	    System.out.println("First selected option : "+s.getFirstSelectedOption().getText());
	    
	    //fetch all the selected option
	    List<WebElement> selected=s.getAllSelectedOptions();
	    for(WebElement ele:selected) {
	    	System.out.println("All selected options : "+s.getAllSelectedOptions());
	    }
	}
}
