package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestRefreshPage {
	WebDriver driver;
	
	@Test
	public void testRefreshPage() throws Exception {
		 System.setProperty("webdriver.chrome.driver", "D:\\interview\\Test_Interview\\Driver\\chromedriver.exe");
	 		// Initialize browser
	 		  driver=new ChromeDriver();
	 		  
	 		  driver.get("https://www.facebook.com/");
	 		  
	 		  Thread.sleep(3000);
		driver.navigate().to("http://google.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		
		
		//forwrd and backword
		String URL="http://www.facebook.com";
		driver.navigate().to(URL);
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
	}
}
