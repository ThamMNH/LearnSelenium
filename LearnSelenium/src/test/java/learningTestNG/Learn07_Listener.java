package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class Learn07_Listener {

	@Test
	public void test01() {
		System.out.println("Chạy test case 01");
	}
	@Test
	public void test02() {
		System.out.println("Chạy test case 02");
		Assert.assertTrue(false);
	}
	@Test (dependsOnMethods = "test02")
	public void test03() {
		System.out.println("Chạy test case 03");
		
	}
}
