package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;

public class IdentifySceneChangesPage {
	
	WebDriver driver;
	public IdentifySceneChangesPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//div[@class='normal-image'])[14]")
	WebElement ele1;
	
	@FindBy (xpath="(//span[@role='img'])[6]")
	WebElement ele2;

	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="sceneChangeThreshold")
	WebElement ele4;
	
	@FindBy (id="destinationPath")
	WebElement ele5;
	
	@FindBy (xpath="//input[@name='file']")
	WebElement ele6;
	
	@FindBy (xpath="//span[text()='Process Content']")
	WebElement ele7;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele8;
	
	@FindBy (xpath="//span[contains(text(),'Edit')]")
	WebElement ele9;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele10;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ele11;
	
	@FindBy (id="q")
	WebElement ele12;
	
	public void identifyAdd(String assetId,String threshold,String destinationPath,String sourcePath,By locator) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(threshold);
		ele5.sendKeys(destinationPath);
		ele6.sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele7.click();
}
	public void identifyEdit(String destination) {
		ele1.click();
		ele8.click();
		ele9.click();
		ele10.clear();
		ele10.click();
		ele10.sendKeys(destination);
		ele11.click();
}
	
public void identifySearch(String asset) {
	ele1.click();
	ele12.sendKeys(asset);
	ele12.sendKeys(Keys.ENTER);
}

//driver.findElement(By.xpath("(//button[@class='hoverable-button'])[14]")).click();
//WebElement element = driver.findElement(By.id("q"));
//element.sendKeys(asset);
//element.sendKeys(Keys.ENTER);
}