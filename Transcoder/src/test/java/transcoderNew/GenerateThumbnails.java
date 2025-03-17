package transcoderNew;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.GenerateThumbnailsPage;
import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;
import transc.AbstractComponents.DriverInitialization;

public class GenerateThumbnails extends DriverInitialization{
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void GenerateThumbnailsAdd(String name,String password) {
		Random random = new Random();
		int randomInt = random.nextInt();
		String assetId = "GenerateThumbnails"+randomInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String timeStamp= "1";
		String timeStamp1= "00:00:10";
		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		GenerateThumbnailsPage gtp = new GenerateThumbnailsPage(driver);
		gtp.generateAdd(assetId, destinationPath);
		gtp.enterTimeStamp(timeStamp, timeStamp1);
		gtp.fileUpdate(sourcePath);
		AbstractComponents ac= new  AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		gtp.generateSubmit();	
	}

	@Test(dataProvider= "loginData",dataProviderClass=DataPassing.class)
	public void generateThumbnailsEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		GenerateThumbnailsPage gtp= new GenerateThumbnailsPage(driver);
		gtp.generateEdit(destination);
		gtp.generateSubmit();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void GenerateThumbnailsSearch(String name,String password) {
		Login la = new Login(driver);
		String assetId = "Asset005";
		la.goTo();
		la.LoginApplication(name, password);
		GenerateThumbnailsPage gtp= new GenerateThumbnailsPage(driver);
		gtp.geneateSearch(assetId);
	}
}
