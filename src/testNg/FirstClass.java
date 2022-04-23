package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class FirstClass {
	WebDriver driver;

	@Test(enabled=false)
	public void dropdownSelect() {
		driver.get("https://ahapick.com/");
		//	new Select(driver.findElement(By.name("product_cat"))).selectByVisibleText("Vegetables");
		//new Select(driver.findElement(By.name("product_cat"))).selectByValue("Fashion");
		new Select(driver.findElement(By.name("product_cat"))).selectByIndex(2);

	}

	@Test(enabled=false,priority=1)
	public void ScrollDown() throws InterruptedException {
		driver.get("http://seleniumlearn.com/github");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 500)");
		// Thread.sleep(3000);


	}

	@Test(enabled=false,priority=2)
	public void ScrollUp() throws InterruptedException {
		driver.get("http://seleniumlearn.com/github");
		Thread.sleep(3000);
		JavascriptExecutor jseup = (JavascriptExecutor)driver;
		jseup.executeScript("scroll(900, 0)");
	}


	@Test (priority=3,enabled=false)// //Indentify Loacator Element
	public void IndentifyLoacatorElement() throws Exception {
		driver.get("https://www.selenium.dev/downloads/");
		{Thread.sleep(5000);
		WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[10]/div/div/p/a"));
		Coordinates coordinate = ((Locatable)element).getCoordinates(); 
		coordinate.onPage(); 
		coordinate.inViewPort();
		}    
	}

	@Test(priority=4,enabled=false) //Right Click on Link,Button and Image etc.. using Selenium Webdriver
	public void RightClick() throws Exception {
		driver.get("http://www.seleniumlearn.com/");
		Thread.sleep(5000); 

		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.linkText("Linux"))).perform();
	}


	@Test(priority=4,enabled=false)
	public void Doubleclick() throws Exception {
		driver.get("http://www.seleniumlearn.com/double-click");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button"))).doubleClick().perform();
	} 

	@Test(priority=5,enabled=false)
	public void draganddropSqure() throws Exception {
		driver.get("http://www.seleniumlearn.com/drag-and-drop-html");

		Actions act=new Actions(driver);

		WebElement source=driver.findElement(By.id("draggable")); // Find the first WebElement using the given method.
		WebElement target=driver.findElement(By.id("droppable"));

		act.dragAndDrop(source,target).perform();

	}

	@Test(enabled=false)
	public void draganddropCircle() throws Exception {

		driver.get("http://www.seleniumlearn.com/drag-and-drop");

		Thread.sleep(5000);
		Actions act=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droptarget"));
		act.dragAndDrop(source,target).perform();

	}

	@Test
	public void mouseover() throws Exception {
		driver.get("http://seleniumlearn.com/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		Actions act=new Actions(driver);

		act.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().perform();

	}



	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\Raju\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}



	@AfterTest
	public void afterTest() {
		//driver.close();
	}

}
