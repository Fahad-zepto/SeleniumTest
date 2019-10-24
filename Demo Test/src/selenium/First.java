package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {

	public static WebDriver driver = null;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Learning\\Selenium Webdriver\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open web address 
		driver.get("http://www.google.com");
		driver.quit();
	}

}  
