package testNg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Group {
	WebDriver driver;


	@Test(groups={"smoke"})
	public void google() throws Exception {
		driver.get("http://www.fb.com");

	}
	@Test(groups={"sanity"})
	public void gmail() throws InterruptedException {
		driver.get("http://www.gmail.com");
	}
	@Test(groups={"Retesting"})
	public void fb() {
		driver.get("http://www.twitter.com");

	}
	@Test(groups={"Regression"})
	public void twitter() {
		driver.get("http://www.quora.com");

	}
	@Test(groups={"sanity"})
	public void googleLangs() {
		driver.get("https://www.google.co.in/imghp");

	}  


	@BeforeTest(groups={"Regression"})
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
