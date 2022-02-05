package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		
		 return driver;
	}
	
	
	public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\Automation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();		
		 return driver;
	}
	

}
