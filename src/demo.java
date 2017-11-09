import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo {

	@BeforeSuite
	public void suite1() {

		System.out.println("Before Suite");

	}

	@AfterSuite
	public void suite2() {

		System.out.println("After Suite");

	}

	@BeforeTest
	public void test1() {
		System.out.println("Before Test");
	}

	@AfterTest
	public void test5() {
		System.out.println("After Test");
	}

	@BeforeMethod
	public void test2() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void test21() {
		System.out.println("After Method");
	}

	@Test
	public void test3() {
		System.out.println("test meth 1 ");
	}

}
