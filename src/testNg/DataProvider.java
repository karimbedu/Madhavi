package testNg;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProvider {
	WebDriver driver;
	String str;

	@org.testng.annotations.DataProvider(name="datainput")
	public String[][] login()
	{
		return new String[][]{
			{"Madhavi","InValidPassword"},
			{"ValidUsername@gmail.com","ValidPassword"},
			{"Lasya","InvalidPassword"}
		};
	}

	@Test (dataProvider="datainput")
	public void login(String uid, String pass)  {

		driver.get("http://hyderabadreport.com/user");
		driver.findElement(By.id("edit-name")).sendKeys(uid);
		driver.findElement(By.id("edit-pass")).sendKeys(pass);
		driver.findElement(By.id("edit-submit")).click();
		try{
			driver.findElement(By.linkText("Logout")).click(); 
			str="Pass";
		}
		catch(Exception e){
			str="Fail";
		}  
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
