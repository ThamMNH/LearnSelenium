package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baitap5 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	public void sleepInSeconds(long timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	@Test
	public void Test01_DragnDrop () {
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement sourceButton = driver.findElement(By.xpath("//li[@class='block13 ui-draggable']"));
		WebElement targetButton = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceButton, targetButton).perform();
		sleepInSeconds(3);
	}
	
//	@Test
//	public void Test02_Doubleclick2 () {
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement doubleclick = driver.findElement(By.xpath("//button[@ondbclick='myFunction()']"));
//		Actions action = new Actions (driver);
//		action.doubleClick(doubleclick).perform();
//		Assert.assertEquals(driver.findElement(By.xpath("0000")).getText(),"You double clicked me.. Thank You..");
//		driver.findElement(By.button("OK")).click();
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Text of Alert: "+alert.getText());
//		String textOnAlert = alert.getText();
//		alert.accept();
//		sleepInSeconds(3);
//	}
	
	@Test
	public void Test3_RightClick () {
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClickMeBtn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions action = new Actions (driver);
		action.contextClick(rightClickMeBtn).perform();
		sleepInSeconds(5);
	}
}
