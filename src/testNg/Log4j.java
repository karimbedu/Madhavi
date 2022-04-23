package testNg;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Logger log= Logger.getLogger("AhaPick");
		PropertyConfigurator.configure("Log4j.properties");
		//System.setProperty(“org.apache.commons.logging.Log”, “org.apache.commons.logging.impl.Jdk14Logger”);

		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome browser launch");
		driver.manage().window().maximize();
		log.info("Browser Maximized");
	
		Thread.sleep(2000);
		log.info("Set wait for a page to load time is 2 seconds");


		driver.get("https://ahapick.com/");
		log.info("Ahapick Website is launched");

		driver.findElement(By.className("search-field")).sendKeys("Apple");
		log.info("Search for Apple");
		driver.findElement(By.className("search-field")).sendKeys(Keys.ENTER);
		log.info("Enter Search for Apple");	
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/ul/li[3]/a[2]")).click();
		log.info("Click on Apple Product");	
		
		driver.close();
		log.info("Browser Closed");

	}

}
