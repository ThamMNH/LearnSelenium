package learningTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Learn04_Group {
 
  @BeforeClass
  public void beforeClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }
  @Test (groups = "smoke test")
  public void testCase01() {
  }
  @Test (groups = "integration test")
  public void testCase02() {
  }
  @Test (groups = "integration test")
  public void testCase03() {
  }
}
