package learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Baitap6 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
	public void Test01_ImplicitWait() {
		driver.get("https://automationfc.github.io/dynamic-loading/");
		driver.findElement(By.xpath("//div[@id='start']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='finish/h4']")).getText(),"Hello World!");
	}
	
//	@Test 
	public void Test02_ExplicitWait() {
		driver.get("https://automationfc.github.io/dynamic-loading/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='start']")) ).click();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id='finish/h4']")).getText(),"Hello World!");
		sleepInSeconds(5);
		
	}

//	@Test 
	public void Test03_Iframe() {
		driver.get("https://kyna.vn/");
		WebElement iframeFb = driver.findElement(By.xpath("//iframe[@id='cs_chat_iframe']"));
		driver.switchTo().frame(iframeFb);
		sleepInSeconds(5);
		
	}
	
	
}
