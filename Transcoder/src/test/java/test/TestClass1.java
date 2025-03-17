package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass1 {
	@Test
	@Parameters({"username"})
	
	public void Login(String username) {
		System.out.println("Login");
		System.out.println(username);
	}
	
	@Test(dataProvider="DataProviderdata")
	public void Logout(String username,String password) {
		System.out.println("Logout");
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@Test(groups= {"smoke"})
	public void Wait() {
		System.out.println("Wait");
		
	}
	
	@DataProvider(name="DataProviderdata")
	@Test
	public Object[][] NewData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "1stUserName";
		data[0][1] = "1stPassword";
		data[1][0] = "2ndUserName";
		data[1][1] = "2ndPassword";
		data[2][0] = "3rdusername";
		data[2][1] = "3rdpassword";
		return data;
		
	}

	

}
