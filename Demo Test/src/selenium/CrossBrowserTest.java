package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

public class CrossBrowserTest {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
	
		System.out.println("Browser is  " + browserName  + "\tThread Number " + Thread.currentThread().getId());
	
		
		//check browser
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Selenium Webdriver\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Learning\\Selenium Webdriver\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Learning\\Selenium Webdriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

	}

	@Test
	public void test1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open web address 
		driver.get("http://www.google.com");
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test completed ");
	}
}
