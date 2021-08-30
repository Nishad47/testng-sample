import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_class {
	  @Test
	  public void f() {
		  System.out.println("test1");
	  }
	  @BeforeMethod
	  public void beforeTest() {
		  System.out.println("Before test1");
	  }

	  @AfterMethod
	  public void afterTest() {
		  System.out.println("After test1");
	  }
}
