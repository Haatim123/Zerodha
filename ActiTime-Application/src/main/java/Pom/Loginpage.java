package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	private WebDriver driver;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath=" //input[@id='keepLoggedInCheckBox']")
	private WebElement checkbox;
	
	
	@FindBy (xpath="//a[@id='loginButton']")   
	private WebElement loginbutton;
	
	
	@FindBy (xpath="//a[@class='logout']")   
	private WebElement logout;
	
	public Loginpage(WebDriver driver) {
		  
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	public void senduUsername() {
		if(username.isDisplayed()) {
			username.sendKeys("admin");
		}
	}
	
	public void sendPassword() {
		if( password.isDisplayed()) {
			 password.sendKeys("manager");
		}
		
	}
	
	public void Tickcheckbox() {
		if(checkbox.isDisplayed()) {
			checkbox.click();
		}
	}
	
	
	
	public void clickonlogin() {
		if(loginbutton.isDisplayed()) {
			loginbutton.click();
		}
	}
	
	public void clickonlogout() {
		
		logout.click();
			
		}
		
	
	
}
