package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;

public class MuxAdd extends AbstractComponents{
	
	WebDriver driver;
	
	public MuxAdd(WebDriver driver) {
		super(driver);
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	

//	@FindBy(className="ant-btn-block")
//	WebElement ele1;
//	
	@FindBy(xpath="(//button[@class=\"hoverable-button\"])[1]")
	WebElement ele2;
	
	@FindBy (xpath="//SPAN[@class='anticon anticon-upload']")
	WebElement ele3;
	
	@FindBy(id="assetId")
	WebElement ele4;
	
	@FindBy(id="destinationPath")
	WebElement ele5;

	@FindBy(xpath="//input[@type='file']")
	WebElement ele6;
	
	@FindBy(xpath="//span[text()='Process Content']")
	WebElement ele7;
	

	
	
	
	
	public void MuxAction(String assetIdDetails,String destinationPath,String sourcePath, By locator) throws InterruptedException {
//		ele1.click();
		ele2.click();
		ele3.click();
		ele4.sendKeys(assetIdDetails);
		ele5.sendKeys(destinationPath);
		ele6.sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele7.click();
		
		
	}


}
