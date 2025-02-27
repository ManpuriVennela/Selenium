package pom_Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPompage {

	
		@FindBy(id="name")
		private WebElement nme;
		
		@FindBy(id="email")
		private WebElement eml;
		
		@FindBy(name="password")
		private WebElement pswd;
		
		@FindBy(xpath="//button[text()='Register']")
		private WebElement btn;

		public RegisterPompage(WebDriver driver) {
			PageFactory.initElements(driver, this);

		}
		public WebElement getNme() {
			return nme;
		}
		
		public void getEml(String email) {
			eml.sendKeys(email);
		}
		public void getPswd(String Password) {
			pswd.sendKeys(Password);
		}
		public void getBtn() {
			btn.click();
		}
		}
	




     


