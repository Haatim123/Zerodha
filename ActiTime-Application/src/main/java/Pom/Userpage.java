package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Userpage {
	
	@FindBy (xpath = "//a[@class='content users']")
	private WebElement users; 
	
	@FindBy (xpath = "//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy (xpath = "//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy (xpath="//a[@class='logout']")   
	private WebElement logout;
	
	
	public Userpage(WebDriver driver1) {
		
		PageFactory.initElements(driver1, this);
	}
     
	public void  clickonusers() {
		if ( users.isDisplayed()) {
			 users.click();
		}
	}
	 
	public void clickonreports() {
		
		if(reports.isDisplayed()) {
			reports.click();
		}
		
	}

	public void clickontasks() {
		
		if(tasks.isDisplayed()) {
			tasks.click();
		}
		
	}
	 public void clickonlogout() {
		 logout.click();
	 }
	
	
	
	
	
}
