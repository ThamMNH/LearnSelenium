package learningTestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Learn06_Parameter {
	@Parameters("browser")
	@Test
	public void runwithBrowser(@Optional ("Firfox") String browserName) {
		System.out.println("Run with browser:" + browserName);
	}
}
