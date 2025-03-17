package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import transc.AbstractComponents.AbstractComponents;

@Test
public class IdentifySceneChange {
	WebDriver driver;
	public IdentifySceneChange(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//div[@class=\"normal-image\"])[14]")
	WebElement ele1;
	
	@FindBy (xpath="(//span[@role=\"img\"])[6]")
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
	
		
	public void sceneChange(String assetId,String threshold,String destinationPath,String sourcePath,By locator) {
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
}