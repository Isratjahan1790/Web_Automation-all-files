package practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class T_testNG {
	
	@Test (priority = 1)
	public void test1() {
		System.out.println("This is test1");
	}
	
	@Test (priority = 0)
	public void test2() {
		System.out.println("This is test2");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before-suite");
	}

	@AfterSuite
	public void Aftersuite() {
		System.out.println("After-suite");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before-test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After-test");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Before-class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After-class");
	}

	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before-method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("After-method");
	}

}
