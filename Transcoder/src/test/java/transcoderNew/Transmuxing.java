package transcoderNew;


import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Transcoder.Login;
import transc.AbstractComponents.DriverInitialization;

public class Transmuxing extends DriverInitialization{
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transmuxingAdd(String name,String password) {
		String assetId="Asset",destinationPath="C:\\Users\\Documents\\New folder";
		Random random = new Random();
		int randomInt = random.nextInt();
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		By locator = By.xpath("//span[@role='img']");
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[15]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId+randomInt);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//span[text()='Process Content']")).click();
		
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transmuxingEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[15]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transmuxingSearch(String name,String password) {
		String asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[15]")).click();
		WebElement element = driver.findElement(By.id("q"));
		element.sendKeys(asset);
		element.sendKeys(Keys.ENTER);
	}
}
