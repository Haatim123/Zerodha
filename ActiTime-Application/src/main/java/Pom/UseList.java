package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UseList {
private WebDriver driver;
	
	@FindBy (xpath="//div[@id='ext-gen6']")
	private WebElement userbutton;
	

	
	
	public UseList (WebDriver driver) {
		  
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
		public String verifyUserButton() {
			String userbuttonTest =	userbutton.getAttribute("id");
			return userbuttonTest;
		
			
	
		}
	
	
}
