package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Users {
	
      private WebDriver driver;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement passWord;
	
	@FindBy (xpath=" //input[@id='keepLoggedInCheckBox']")
	private WebElement checkbox;
	
	
	@FindBy (xpath="//a[@id='loginButton']")   //input[@id='keepLoggedInCheckBox']
	private WebElement loginbutton;
	
	
	@FindBy (xpath="//a[@class='content users']")
	private WebElement userlist;
	
	@FindBy (xpath="//div[@id='ext-gen6']")
	private WebElement userbutton;
	
	@FindBy (xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy (xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy (xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy (xpath="//input[@name='passwordCopy']")
	private WebElement repass;
	
	@FindBy (xpath="//div[@class='close-button']")
	private WebElement CloseUsertab;
	
	public Users(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void senduserName() {
		if(userName.isDisplayed()) {
			userName.sendKeys("admin");
		}
	}
	
	public void sendpassWord() {
		if( passWord.isDisplayed()) {
			passWord.sendKeys("manager");
		}
	}
	public void checkBox() {
		if(checkbox.isDisplayed()) {
			checkbox.click();
		}
	}
	
	public void clickonloginbutton() {
		if(loginbutton.isDisplayed()) {
			loginbutton.click();
		}
	}
	public void userlist() {
		if(userlist.isDisplayed()) {
			userlist.click();
		}
	}
	
	
	
	public void clickonuserbutton() {
		if(userbutton.isDisplayed()) {
			userbutton.click();
		}
	}
			  
		
	
	
	public void firstname() {
		if(firstname.isDisplayed()) {
			firstname.sendKeys("hatim");
		}
	}	
		
	public void lastname() {
		if(lastname.isDisplayed()) {
			lastname.sendKeys("shikalgar");
		}
	}	
	
	public void email() {
		if(email.isDisplayed()) {
			email.sendKeys("shikalgarhatim7");
		}
	}
	
	public void username() {
		if(username.isDisplayed()) {
			username.sendKeys("Hatims");
		}
	}	
	 
	public void password() {
		if(password.isDisplayed()) {
			password.sendKeys("asdf123");
		}
	}
	
	public void repass() {
		if(repass.isDisplayed()) {
			repass.sendKeys("asdf123");
		}
	}
	
	
	
	public void closeusertab() {
		if(CloseUsertab.isDisplayed()) {
			CloseUsertab.click();
			
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
