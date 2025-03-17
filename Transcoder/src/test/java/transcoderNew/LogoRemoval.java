package transcoderNew;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import Transcoder.Login;
import Transcoder.LogoRemovalPage;
import Transcoder.LogoRemoveSearch;
import transc.AbstractComponents.DriverInitialization;

public class LogoRemoval extends DriverInitialization{
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void logoRemovalAdd(String name,String password) {
		Random ra = new Random();
		int raInt= ra.nextInt();
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		String assetId = "abcd"+raInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String logoRemovalstartTime="00:00:30",logoRemovalduration="00:00:50";
		String logoRemovalParametersimageH = "1",logoRemovalParametersimageW="2";
		String logoRemovalParameters = "2",logoRemovalParametersimageY="4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		LogoRemovalPage lrp = new LogoRemovalPage(driver);
		lrp.logoAdd(assetId, destinationPath, logoRemovalParameters, logoRemovalParametersimageY, logoRemovalParametersimageH, logoRemovalParametersimageW, logoRemovalstartTime, logoRemovalduration, sourcePath, locator);
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void logoRemovalEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[9]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void logoRemovalSearch(String name,String password) {
		String asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		LogoRemoveSearch lrs = new LogoRemoveSearch(driver);
		lrs.LogoSearch(asset);
	}
	
}
