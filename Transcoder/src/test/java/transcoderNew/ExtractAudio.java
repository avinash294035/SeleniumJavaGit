package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Transcoder.ExtractAudioPage;
import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;
import transc.AbstractComponents.DriverInitialization;


public class ExtractAudio extends DriverInitialization{
		
	@Test(dataProvider="loginData", dataProviderClass=DataPassing.class, groups={"smoke"})
	public void extractAudioAdd(String name,String password) throws InterruptedException {
		System.out.println(driver);
		Random random = new Random();
		int randomInt = random.nextInt(); 
		String assetId = "audio"+randomInt;
		String destinationPath = "C:\\Users\\Documents\\New folder";
		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator =   By.xpath("//div[@class='ant-message-notice-content']");
		By locator1 = By.cssSelector(("div[title='aac'] div[class='ant-select-item-option-content']"));
		Login la = new Login(driver);
		la.goTo();	
		la.LoginApplication(name, password);
		ExtractAudioPage eap= new ExtractAudioPage(driver);
		eap.audioAdd(assetId, destinationPath, sourcePath);
		AbstractComponents ea =new AbstractComponents(driver);
		ea.ElementToBeClickable(locator1);
		eap.audioVisibilityElementClick();
		ea.visibiltyOfElement(locator);
		eap.audioProcessClick();
		
		driver.close();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void extractAudioEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		ExtractAudioPage eap= new ExtractAudioPage(driver);
		eap.audioEdit(destination);
	 } 
	
	 @Test(dataProvider="loginData", dataProviderClass=DataPassing.class,groups= {"smoke"})
	 public void extractAudioSearch(String name,String password){
		String assetId = "Asset002";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		ExtractAudioPage eap= new ExtractAudioPage(driver);
        eap.audioSearch(assetId);
	 } 
}