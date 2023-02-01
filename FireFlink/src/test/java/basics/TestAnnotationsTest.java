package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationsTest {
	
	@BeforeSuite 
	public void beforeSuite() {
	System.out.println("LN suite before");
	
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@Test(groups = "smoke")
	public void test() {
		System.out.println("test");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeMethod 
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	 public void afterMethod() {
		System.out.println("after method");
	}
}
