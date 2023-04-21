package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample2 {

	@Test
	public void weblogincarloan() {
		System.out.println("this is weblogincarloan ");
		
	}
	@Test(dependsOnMethods= {"weblogincarloan"})
	public void Mobilelogincarloan() {
		System.out.println("this is Mobilelogincarloan ");
	}
	@Test(groups= {"smoke"})
	public void APIlogincarloan() {
		System.out.println("this is APIlogincarloan ");
	}
	@BeforeTest
	public void prioryty() {
		System.out.println("this is @BeforetestAnnotation ");
	}
	@BeforeClass
	public void prioryty1() {
		System.out.println("this is @Beforeclass sample2 Annotation ");
	}
	@AfterClass
	public void prioryty2() {
		System.out.println("this is @Afterclass sample2 Annotation ");
	}
	
}
