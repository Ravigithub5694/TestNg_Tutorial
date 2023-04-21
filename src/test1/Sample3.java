package test1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test
	public void webloginHomeloan() {
		System.out.println("this is webloginHomeloan ");
		
	
	}
	@Test(dataProvider= "getdata")
	public void usedata(String name, String password) {
		System.out.println(name);
		System.out.println(password);
	}
	
	@Test(groups= {"smoke"})
	public void MobilelogincHomeloan() {
		System.out.println("this is MobilelogincHomeloan ");
	}
	@Test
	public void APIloginHomeloan() {
		System.out.println("this is APIloginHomeloan ");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("this is beforesuite ");
	}
	@DataProvider
	public Object[][] getdata() {
		//to repeat the data for 3 sets
		Object[][] data=new Object[3][2];
		data[0][0]="ravi1";
		data[0][1]="password1";
		data[1][0]="ravi2";
		data[1][1]="password2";
		data[2][0]="ravi3";
		data[2][1]="password3";
		return data;
	}

}
