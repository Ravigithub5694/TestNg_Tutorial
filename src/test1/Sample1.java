package test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 {

	@Test
	public void test1() {
		System.out.println("Hello TestNG");
	}
	@Test
	public void test2() {
		System.out.println("Hello Ravi");
	}
	@Parameters({"url"})
	@Test
	public void test3(String url) {
		System.out.println("Hello bye");
		System.out.println(url);
	}
	@AfterSuite
	public void test4() {
		System.out.println("thihs is after suite");
	}
	@BeforeMethod
	public void test5() {
		System.out.println("this is beforemethod for sample 1 calss level");
	}
	@AfterMethod
	public void test6() {
		System.out.println("this is aftermethod for sample 1 calss level");
}}
