package testNg;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IrctcTabs {
	WebDriver driver;
	
	@Test
	  public void irctc() throws Exception{
		  driver.get("https://www.irctc.co.in/");
		  Thread.sleep(5000);
		  
		  driver.findElement(By.linkText("e-Catering")).click();
		  
		  ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs1.get(1));
		  
		  driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/div[1]/div[1]/div/div/div/div")).click();
		  driver.findElement(By.id("mobileNum")).sendKeys("9000109120");
		  driver.findElement(By.name("email")).sendKeys("kpurushotham.777@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/div/form/div[2]/button[2]")).click();
		  driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();
		  ArrayList<String> tabs0 = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(tabs0.get(0));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button")).click();
		  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[1]")).click();
	  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

}
