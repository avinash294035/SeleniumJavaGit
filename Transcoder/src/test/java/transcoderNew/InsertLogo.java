package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.InsertLogoPage;
import Transcoder.Login;
import transc.AbstractComponents.DriverInitialization;

public class InsertLogo extends DriverInitialization{
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void InsertLogoAdd(String name,String password) {
		Random random = new Random();
		int randomInt = random.nextInt();
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		String assetId = "Asset"+randomInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String logoInsertstartTime="00:00:30",insertParametersOpacity="1",insertParametersendTime="00:00:50";
		String logoInsertParametersimagePath = "folder";
		String logoInsertParameters = "2",logoInsertParametersimageY="4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		InsertLogoPage ilp = new InsertLogoPage(driver);
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		ilp.insertAdd(assetId, destinationPath,logoInsertParameters,logoInsertParametersimageY, logoInsertParametersimagePath,insertParametersOpacity,logoInsertstartTime,insertParametersendTime, sourcePath,locator);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void insertLogoEdit(String name,String password) {
			String destination ="/in";
			Login la = new Login(driver);
			la.goTo();
			la.LoginApplication(name, password);
			InsertLogoPage ilp = new InsertLogoPage(driver);
			ilp.insertEdit(destination);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void insertLogoSearch(String name, String password) {
		Login la = new Login(driver);
		String asset="Asset";
		la.goTo();
		la.LoginApplication(name, password);
		InsertLogoPage ilp= new InsertLogoPage(driver);
		ilp.insertSearch(asset);
	}
}
