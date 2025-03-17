package Transcoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;


public class IdentifyKeyFramesPage {
	
	WebDriver driver;
	
	public IdentifyKeyFramesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[13]") 
	WebElement ele1;
	
	@FindBy (xpath="(//button[@type=\"button\"])[4]")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (xpath="//input[@name='file']")
	WebElement ele5;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ele6;
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[13]")
	WebElement ele10;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele11;
	
	@FindBy (xpath="//span[contains(text(),'Edit')]")
	WebElement ele12;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele13;
	
	@FindBy(id="q")
	WebElement ele14;

	@FindBy (xpath="(//button[@type='button'])[3]")
	WebElement ele15;
	
	public void identifyAdd(String assetId,String destinationPath,String contentPath,String startPosition,String duration,String sourcePath,By locator) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele6.click();
	}
	
	public void identifyEdit(String destination) {
		ele1.click();
		ele11.click();
		ele12.click();
		ele13.clear();
		ele13.click();
		ele13.sendKeys(destination);
		ele6.click();
		
	}
	
	
	public void identifySearch(String searchData) {
		ele1.click();
		ele14.sendKeys(searchData);
		ele15.click();
	}

}
