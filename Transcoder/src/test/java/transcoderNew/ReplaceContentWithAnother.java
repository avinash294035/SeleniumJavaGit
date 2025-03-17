package transcoderNew;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Transcoder.Login;
import Transcoder.ReplaceContentSearch;
import transc.AbstractComponents.DriverInitialization;

public class ReplaceContentWithAnother extends DriverInitialization{
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ReplaceContentWithAnotherAdd(String name,String password){
		Random ra = new Random();
		int raInt = ra.nextInt();
		Login la = new Login(driver);
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		la.goTo();
		la.LoginApplication(name,password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[2]")).click();
		driver.findElement(By.xpath("//span[normalize-space(text())='Upload Video']")).click();
		driver.findElement(By.id("assetId")).sendKeys("abc"+raInt);
		driver.findElement(By.id("destinationPath")).sendKeys("C:\\Users\\Documents\\New folder");
		driver.findElement(By.id("alternateContentPath")).sendKeys("alternateContentPath");
		driver.findElement(By.id("startPosition")).sendKeys("00:00:10");
		driver.findElement(By.id("duration")).sendKeys("00:00:20");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//span[normalize-space(text())='Process Content']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ReplaceContentWithAnotherEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void ReplaceContentWithAnotherSearch(String name,String password) {
	String content = "Asset003";	
	Login la = new Login(driver);
	la.goTo();
	la.LoginApplication(name, password);
	ReplaceContentSearch rcs = new ReplaceContentSearch(driver);
	rcs.ReplaceContent(content);
}
}
