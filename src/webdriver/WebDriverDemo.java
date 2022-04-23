package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Dharshan\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumlearn.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/nav/ul/li[12]/a")).click();;
	}

}
