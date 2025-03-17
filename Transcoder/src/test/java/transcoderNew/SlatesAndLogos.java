package transcoderNew;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Transcoder.Login;
import transc.AbstractComponents.DriverInitialization;

public class SlatesAndLogos extends DriverInitialization{
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void SlatesAndLogosAdd(String name, String password) {
		Random ra = new Random();
		int raInt = ra.nextInt();
		Login la = new Login(driver);
		la.goTo();
		String assetId = "slatesandlogos"+ raInt;
		String destinationPath = "C:\\Users\\Documents\\New folder",logoImagePath="0" , logoOpacity="0", slatePath="1";String slatesSlatePath = "2";
		String height="2";
		String logoImageY="12";
		String logoDuration="1",logoImageX="0";
		String width="2";
		String logoStartTime="00:00:10";
		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator1= By.cssSelector("div[title='High'] div[class='ant-select-item-option-content']");
		By locator =  By.xpath("//span[@role='img']");
		la.LoginApplication(name,password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label=\"upload\"]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("width")).sendKeys(width);
		driver.findElement(By.id("height")).sendKeys(height);
		driver.findElement(By.id("qualityFactor")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
		ele.click();
		driver.findElement(By.id("logos_0_imageX")).sendKeys(logoImageX);
		driver.findElement(By.id("logos_0_imageY")).sendKeys(logoImageY);
		driver.findElement(By.id("logos_0_imagePath")).sendKeys(logoImagePath);
		driver.findElement(By.id("logos_0_opacity")).sendKeys(logoOpacity);
		driver.findElement(By.id("logos_0_startTime")).sendKeys(logoStartTime);
		driver.findElement(By.id("logos_0_duration")).sendKeys(logoDuration);
		driver.findElement(By.id("slates_0_startPosition")).click();
		driver.findElement(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[3]")).click();
		driver.findElement(By.id("slates_1_startPosition")).click();
		driver.findElement(By.id("slates_0_slatePath")).sendKeys(slatePath);
		driver.findElement(By.id("slates_1_startPosition")).click();
		driver.findElement(By.xpath("//div[@class=\"ant-select-item ant-select-item-option ant-select-item-option-active\"]/div")).click();
		driver.findElement(By.id("slates_1_slatePath")).sendKeys(slatesSlatePath);
		driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys(sourcePath);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();	
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void slatesAndLogoEdit(String name, String password) {
	String destination ="/in";
	Login la = new Login(driver);
	la.goTo();
	la.LoginApplication(name, password);
	driver.findElement(By.xpath("(//button[@class='hoverable-button'])[5]")).click();
	driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
	WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
	ele3.clear();
	ele3.click();
	ele3.sendKeys(destination);
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void slatesAndLogosSearch(String name, String password) {
		String assetId = "Asset004";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[4]")).click();
		driver.findElement(By.id("q")).sendKeys(assetId);
	}
}