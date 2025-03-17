package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 
public class TestClass2 {
	
	@Parameters({"username","password"})
	@Test
	
	public void mobileLogin(String username, String password) {
		System.out.println("Mobile Login");
	}
	
	@Test(dependsOnMethods = {"mobileWait"})
	public void mobileLogout() {
		System.out.println("mobile Logout");
	}
	
	@Parameters({"username", "Password"})
	@Test
	public void mobileWait() {
		System.out.println("mobile Wait");
		
	}

}
