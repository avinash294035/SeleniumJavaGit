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
import transc.AbstractComponents.AbstractComponents;
import transc.AbstractComponents.DriverInitialization;

public class TranscodingModule extends DriverInitialization {
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transcodingAdd(String name,String password) {
		Random random = new Random();
		int randomInt = random.nextInt();
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name,password);
		String assetId = "Asset"+randomInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String outputGroupswidth= "2",outputGroupsHeight="3";
		String outputGroupsBitrate= "4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[12]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("outputGroups_0_width")).sendKeys(outputGroupswidth);
		driver.findElement(By.id("outputGroups_0_height")).sendKeys(outputGroupsHeight);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		By element4 = (By.xpath("//div[@title='High']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element4));
		driver.findElement(element4).click();
		driver.findElement(By.id("outputGroups_0_bitrate")).sendKeys(outputGroupsBitrate);
		driver.findElement(By.id("outputGroups_0_destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transcodingEdit(String name,String password) {
		String destination ="/in";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[12]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(dataProvider="loginData",dataProviderClass=DataPassing.class)
	public void transcodingSearch(String name,String password) {
		String asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(name, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[12]")).click();
		WebElement element = driver.findElement(By.id("q"));
		By locator = By.xpath("//td[text()='Asset001']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(asset);
		element.sendKeys(Keys.ENTER);
	}
}
