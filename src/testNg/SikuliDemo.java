package testNg;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;
import org.testng.annotations.BeforeTest;

public class SikuliDemo {
	
	Screen s=new Screen();
	WebDriver driver;
	
  @Test
  public void sikuliDesktop() throws SikuliException {
	  driver.get("http://seleniumlearn.com/");
	  s.click("E:\\Lib\\Sikuli\\Sikuli.png");
	 // s.click("E:\\Lib\\Sikuli\\Paint.png");
	  //s.click("E:\\Lib\\Sikuli\\Close.png");
	  //s.type("E:\\Lib\\Sikuli\\Search.png", "Sikuli");
	//  s.dragDrop("E:\\Lib\\Sikuli\\TC.png", "E:\\Lib\\Sikuli\\WD.png");
  }
  @BeforeTest
  public void beforeTest() {
  System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

}
