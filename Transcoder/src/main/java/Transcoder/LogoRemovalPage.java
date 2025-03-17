package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;

public class LogoRemovalPage {
	
	WebDriver driver;
	
	public LogoRemovalPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[9]")
	WebElement ele1;
	
	@FindBy (xpath="//span[@aria-label='upload']")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (id="logoRemovalParameters_0_imageX")
	WebElement ele5;
	
	@FindBy (id="logoRemovalParameters_0_imageY")
	WebElement ele6;
	
	@FindBy (id="logoRemovalParameters_0_imageH")
	WebElement ele7;
	
	@FindBy (id="logoRemovalParameters_0_imageW")
	WebElement ele8;
	
	@FindBy (id="logoRemovalParameters_0_startTime")
	WebElement ele9;
	
	@FindBy (id="logoRemovalParameters_0_duration")
	WebElement ele10;
	
	@FindBy (xpath ="//input[@name='file']")
	WebElement ele11;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ele12;
	
	public void logoAdd(String assetId,String destinationPath,String logoRemovalParameters,String logoRemovalParametersimageY,String logoRemovalParametersimageH,String logoRemovalParametersimageW,String logoRemovalstartTime,String logoRemovalduration,String sourcePath,By locator ) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.sendKeys(logoRemovalParameters);
		ele6.sendKeys(logoRemovalParametersimageY);
		ele7.sendKeys(logoRemovalParametersimageH);
		ele8.sendKeys(logoRemovalParametersimageW);
		ele9.sendKeys(logoRemovalstartTime);
		ele10.sendKeys(logoRemovalduration);
		ele11.sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele12.click();
	}
}
