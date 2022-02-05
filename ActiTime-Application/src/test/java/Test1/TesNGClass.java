package Test1;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.Loginpage;
import Pom.UseList;
import Pom.Userpage;
import base.Base;




public class TesNGClass extends Base{
	private WebDriver driver;
	private Loginpage  loginpage;
	private Userpage userpage;
	private UseList uselist;
	SoftAssert a;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		
		
		
		
		if(browser.equals("chrome"))
		{
			driver=openChromeBrowser();
		}
		if(browser.equals("firefox"))
			
		{
			driver=openFireFoxBrowser();
		}
			
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

}
	
	  @BeforeClass
	 public void initializePomClasses()  
	 {  
		  loginpage =new  Loginpage(driver); 
		  userpage =new Userpage(driver);
		  uselist =new UseList(driver);
	  }
	
	
     @BeforeMethod
	public  void loginActiTime() {
    	 
		
		driver.get("http://localhost/login.do");
		
		 
		
		 
		 loginpage.senduUsername();
		 loginpage.sendPassword();
		 loginpage.Tickcheckbox();
		 loginpage.clickonlogin();
		 
		 a =new SoftAssert(); 
		 
}
	
	@Test
	public void toVerifyUserTab() {
		System.out.println("toVerifyUserTab");
       
        userpage.clickonusers();
        
        System.out.println(driver.getCurrentUrl());
        
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
		
		String buttonName=uselist.verifyUserButton();
		a.assertEquals(buttonName, "ext-gen6");
		a.assertAll();
		
		
	}			
	
	
		@Test(priority=2 )
		public void testA() {
		System.out.println("Testing of A");		
		
	}
		
		@Test(priority=1,invocationCount=3)
		public void testB() {
		System.out.println("Testing of B");		
		Assert.assertEquals("Hatim", "Hatim");
		
	}
		@Test(priority=3,dependsOnMethods={"toVerifyUserTab"})
		public void testC() {
		System.out.println("Testing of C");		
		
		
		a.assertEquals("ABCD", "ABCD");
		a.assertAll();
	}
		
	
		@Test (priority=4)
		
		public void testD() {
			
			System.out.println("Testing of D");
		a.assertEquals("XYZ", "XYZ");
	    a.assertAll();	
		
	}
		
	@AfterMethod
	public void logoutfromActitime() throws InterruptedException {
		Thread.sleep(3000);
		loginpage.clickonlogout();
         System.out.println("logoutfromActitime"); 
       }
	
	
	@AfterClass
	
	 public void closetheobjexts()  
	 {  
		  loginpage =null;
		  userpage =null;
		  uselist =null;
		  System.gc();
	  }
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	

}
