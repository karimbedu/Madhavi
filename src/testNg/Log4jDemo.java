package testNg;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {

	WebDriver driver;
	
	
	@Test
	public void f() {
		Logger logger= Logger.getLogger("LogLearning");
		PropertyConfigurator.configure("Log4j.properties");
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
