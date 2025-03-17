package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.IdentifyKeyFramesPage;
import Transcoder.Login;
import transc.AbstractComponents.DriverInitialization;

@Test
public class IdentifyKeyFrames extends DriverInitialization{
	
	@Test(dataProvider="loginData", dataProviderClass=DataPassing.class)
	public void identifyKeyFramesAdd(String name,String password) {
		Random random = new Random();
		int raInt = random.nextInt();
		Login la = new Login(driver);
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		la.goTo();
		la.LoginApplication(name,password);
		IdentifyKeyFramesPage ikf = new IdentifyKeyFramesPage(driver);
		ikf.identifyAdd("Asset"+raInt, "C:\\Users\\Documents\\New folder", "C:\\Users\\Documents\\New folder","00:00:10","00:00:50","C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4", locator);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void identifyKeyFramesEdit(String user, String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(user, password);
		IdentifyKeyFramesPage ikf = new IdentifyKeyFramesPage(driver);
		ikf.identifyEdit(destination);	
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void identifyKeyFramesSearch(String userName,String password) {
	String searchData = "assetId001";
	Login la = new Login(driver);
	la.goTo();
	la.LoginApplication(userName, password);
	IdentifyKeyFramesPage ikf = new IdentifyKeyFramesPage(driver);
	ikf.identifySearch(searchData);
	}
}
