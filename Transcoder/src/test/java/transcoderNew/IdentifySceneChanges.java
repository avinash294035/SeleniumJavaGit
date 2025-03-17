package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.IdentifySceneChangesPage;
import Transcoder.Login;
import transc.AbstractComponents.DriverInitialization;

@Test
public class IdentifySceneChanges extends DriverInitialization{
		
	@Test(dataProvider="loginData", dataProviderClass=DataPassing.class)
	public void identifySceneChangesAdd(String name,String password) {
		Random ra= new Random();
		int randomInt = ra.nextInt();
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		IdentifySceneChangesPage isc= new IdentifySceneChangesPage(driver);
		isc.identifyAdd("Asset"+randomInt,"1","C:\\Users\\Documents\\New folder", "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4",locator);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void identifySceneChangesEdit(String name, String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		IdentifySceneChangesPage iscp = new IdentifySceneChangesPage(driver);
		iscp.identifyEdit(destination);
	}

	@Test(dataProvider="loginData", dataProviderClass=DataPassing.class)
	public void identifySceneChangesSearch(String name, String password) {
		String asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		IdentifySceneChangesPage iscp = new IdentifySceneChangesPage(driver);
		iscp.identifySearch(asset);
	}
}
