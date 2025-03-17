package transcoderNew;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Transcoder.Login;
import Transcoder.MuxAdd;
import Transcoder.MuxSearch;
import transc.AbstractComponents.DriverInitialization;

public class MuxingAudioandVideo extends DriverInitialization{
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void muxingAudioAndVideoAdd(String name,String password) throws InterruptedException {
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Random ra = new Random();
		int raInt= ra.nextInt();
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		MuxAdd ma= new MuxAdd(driver);
		ma.MuxAction("upload"+raInt, "C:\\Users\\Documents\\New folder", "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4",locator);
   }
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void muxingAudioAndVideoEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void muxingAudioAndVideoSearch(String name,String password) {
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		MuxSearch ms= new MuxSearch(driver);
		ms.muxSearchAction("Asset001");
	}
}
