package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Transcoder.Login;
import Transcoder.MuteAudioPage;
import transc.AbstractComponents.DriverInitialization;

public class MuteAudio extends DriverInitialization {
	
	@Test(dataProvider="loginData", dataProviderClass=DataPassing.class)
	public void muteAudioAdd(String name,String password) {

		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Random ra = new Random();
		int raInt = ra.nextInt();
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		String assetId = "abcd"+raInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String startTime= "00:00:10";
		String endTime = "00:00:20";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		MuteAudioPage map = new MuteAudioPage(driver);
		map.muteAudioAdd(assetId, destinationPath, startTime, endTime, sourcePath, locator);
}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void muteAudioEdit(String name, String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		MuteAudioPage map = new MuteAudioPage(driver);
		map.muteAudioEdit(destination);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void muteAudioSearch(String name,String password) {
		String assetId = "Asset004";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[7]")).click();
		WebElement element1= driver.findElement(By.id("q"));
		element1.sendKeys(assetId);
		element1.sendKeys(Keys.ENTER);
	}
}
