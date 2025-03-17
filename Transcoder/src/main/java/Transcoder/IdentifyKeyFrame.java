package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;

public class IdentifyKeyFrame extends AbstractComponents{
	WebDriver driver;
	public IdentifyKeyFrame(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[2]") 
	WebElement ele1;	
	
	@FindBy (xpath="(//button[@type=\"button\"])[4]")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy(id="alternateContentPath")
	WebElement ele7;
	
	@FindBy (id="startPosition")
	WebElement ele8;
	
	@FindBy (id="duration")
	WebElement ele9;
	
	@FindBy (xpath="//input[@name='file']")
	WebElement ele5;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ele6;


	public void KeyFrame(String assetId,String destinationPath,String contentPath,String startPosition,String duration,String sourcePath,By locator) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele7.sendKeys(contentPath);		
		ele8.sendKeys(startPosition);
		ele9.sendKeys(duration);
		ele5.sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele6.click();
		
	}
	
	


	
}
