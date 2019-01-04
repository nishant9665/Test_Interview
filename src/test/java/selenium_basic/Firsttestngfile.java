package selenium_basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttestngfile {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	   
	    public WebDriver driver ; 
	     
	     @BeforeMethod
	      public void launchBrowser() {
	    	 System.setProperty("webdriver.chrome.driver", "D:\\interview\\Test_Interview\\Driver\\chromedriver.exe");
	 		// Initialize browser
	 		  driver=new ChromeDriver();
	          driver.get(baseUrl);
	      }
	      @Test(priority=2,description="test-1")
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @Test(priority=2,description="test-2")
	      public void verifyHomepageTitle2() {
	          String expectedTitle = "Welcome: Mercury Tours";
	          String actualTitle = driver.getTitle();
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @AfterMethod
	      public void terminateBrowser() throws Exception{
	    	  Thread.sleep(5000);
	          driver.close();
	      }
}
