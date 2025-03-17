package transcoderNew;

import org.testng.annotations.DataProvider;

public class DataPassing {
	
	@DataProvider(name="loginData")
	public Object[][] loginData() {
		Object[][] login = {{"Automatio04@maildrop.cc", "Password@123"},{"1@gmail.com","Password@234"}};
		return login;
		
				
	}

}
