package transcoderNew;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.ExtractFramesPage;
import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;
import transc.AbstractComponents.DriverInitialization;
 
@Test()
public class ExtractingFrames extends DriverInitialization{

	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ExtractingFramesAdd(String name, String password) {	
		    Random random = new Random();
		    int randomInt = random.nextInt();
			String assetId = "abc"+randomInt;
			String destinationPath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
			By locator = By.xpath("//span[@role='img']");
			Login la = new Login(driver);
			la.goTo();
			la.LoginApplication(name,password);
			ExtractFramesPage efp = new ExtractFramesPage(driver);
			String startNumber="00:40";
			String endFrameNumber="00:55";
			efp.extractAdd(assetId, destinationPath, startNumber,endFrameNumber);			
			AbstractComponents ac = new AbstractComponents(driver);
			ac.visibiltyOfElement(locator);
			efp.extractSubmit();
		}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ExtractingFramesEdit(String name,String password)	{
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		ExtractFramesPage efp = new ExtractFramesPage(driver);
		efp.extractEdit(destination);
		efp.extractSubmit();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ExtractingFramesSearch(String name,String password) {
		String assetData = "Asset004";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		ExtractFramesPage efs= new ExtractFramesPage(driver);
		efs.extractSearch(assetData);
	}
	
}



