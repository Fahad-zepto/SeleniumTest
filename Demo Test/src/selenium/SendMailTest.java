package selenium;

import org.testng.annotations.*;
import org.testng.Assert;

public class SendMailTest {
//	WebDriver driver;
//	
//	System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Selenium Webdriver\\chrome\\chromedriver.exe");
//	driver = new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	
//	//open web address 
//	driver.get("http://www.google.com");
//	
//	driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("facebook");
//	driver.findElement(By.xpath("/html/body/div/div[4]/form/div[2]/div[1]/div[3]/center/input[1]")).click();
//	
//	driver.quit();
	
	//login test script
	@Test(priority = 1) 
	public void login() {
		
		System.out.println("Starting login test");
		
		Assert.fail("error message");
		
	}
	
	//send mail test script
	@Test(priority = 2, dependsOnMethods = {"login"}) 
	public void sendMail() {
		
		System.out.println("Starting send mail test");
		
		
	}
	
	//logout test script
	@Test(priority = 3, dependsOnMethods = {"login","sendMail"}) 
	public void logout() {
		
		System.out.println("Starting logout test");
		
		
	}

}

