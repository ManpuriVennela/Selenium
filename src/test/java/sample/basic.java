package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class basic {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	       WebElement srch=driver.findElement(By.id("small-searchterms"));
           srch.sendKeys("shoes");
           driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(srch)).click();
WebElement login=driver.findElement(By.linkText("Log in"));
login.click();
driver.findElement(By.className("email")).sendKeys("vennele@gmail.com");
driver.findElement(RelativeLocator.with(By.className("name")).below(login));
}
}
