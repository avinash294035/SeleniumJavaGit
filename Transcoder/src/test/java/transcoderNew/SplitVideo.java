package transcoderNew;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;
import transc.AbstractComponents.DriverInitialization;

public class SplitVideo extends DriverInitialization{
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void splitVideoAdd(String name,String password) {
		Random ra = new Random();
		int raInt = ra.nextInt();
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		String assetId = "abcd"+raInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String splitVideostartTime= "00:00:50",splitVideoDuration="00:00:59";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[11]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("splitVideoParameters_0_startTime")).sendKeys(splitVideostartTime);
		driver.findElement(By.id("splitVideoParameters_0_duration")).sendKeys(splitVideoDuration);
		driver.findElement(By.id("splitVideoParameters_0_destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void splitVideoEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[11]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void splitVideoSearch(String name,String password) {
		String asset = "Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[10]")).click();
		WebElement element = driver.findElement(By.id("q"));
		element.sendKeys(asset);
		element.sendKeys(Keys.ENTER);	
	}

}
