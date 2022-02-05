package Test1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestNG2 {
	private static final String priority = null;
	private WebDriver driver;
	private Pom.Users users;
    @BeforeClass 	
    
	public  void actitimelogin() {
    	System.setProperty("webdriver.chrome.driver", "E:\\chrome97 version\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		
    }
	
	@BeforeMethod
	
	public void launchActitime() throws InterruptedException {
		
		driver.get("http://localhost/login.do");
		users =new Pom.Users(driver);
		Thread.sleep(5000);
		users.senduserName();
		Thread.sleep(5000);
		users.sendpassWord();
		Thread.sleep(3000);
		Thread.sleep(3000);
		users.checkBox();
		Thread.sleep(3000);
		users.clickonloginbutton();
		Thread.sleep(3000);
		users.userlist();
		Thread.sleep(3000);
		users.clickonuserbutton();
		Thread.sleep(3000);
		users.firstname();
		Thread.sleep(3000);
		users.lastname();
		Thread.sleep(3000);
		users.email();
		Thread.sleep(3000);
		Thread.sleep(3000);
		users.password();
		Thread.sleep(3000);
		users.repass();
		
	}
	
	@Test
	public void getUrl() {
		
        String url = driver.getCurrentUrl();
		
		
		System.out.println(url);
		
		if(url.equals("http://localhost/administration/userlist.do"))
		{
			System.out.println("pass");
		}
		else
		{	
			System.out.println("fail");
		}	
		
		Assert.assertEquals("ABCD", "ABCD");
		
	}
	
	@Test (priority= 1)
	
	public void testA() {
		System.out.println("Testing of A");
	
	
}
   @Test (priority=2)	
	public void testB() {
	   System.out.println("Testing of B");
   }
	
   @Test(priority=3)	
	public void testC() {
	   System.out.println("Testing of C");
  }
   
	@AfterMethod
	public void logoutfromActitime() throws InterruptedException {
		Thread.sleep(3000);
		users.closeusertab();
		
		Alert alt =driver.switchTo().alert();
		alt.accept();
		
         System.out.println("close user tab"); 
       }
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	
}