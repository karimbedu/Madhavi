package testNg;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertWindows {
	WebDriver driver;


	@Test(enabled=false)
	public void alertOk() throws Exception{
		driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
	}
	
	@Test(enabled=false)
	public void alertCancel() throws Exception{
		driver.get("http://www.seleniumlearn.com/confirmation-dialog-box");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
	}
	
	@Test(enabled=true)
	public void alertTextSendOk() throws Exception{
		driver.get("http://www.seleniumlearn.com/prompt-dialog-box");
	
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);
		alert.sendKeys("Welcome to Ahapick");
		Thread.sleep(5000);
		alert.accept();
	}


	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
