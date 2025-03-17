package transcoderNew;

import org.testng.annotations.DataProvider;

public class GiveData {
	
	@DataProvider(name= "inputData")
	public Object[][] logData(){
		Object[][] loginInputData= {{"automatio03@maildrop.cc","Password@123"}};
		return loginInputData;
	}
	

}
