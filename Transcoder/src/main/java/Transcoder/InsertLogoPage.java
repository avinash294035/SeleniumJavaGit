package Transcoder;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import transc.AbstractComponents.AbstractComponents;

public class InsertLogoPage {
	
	WebDriver driver;
	public InsertLogoPage( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[8]")
	WebElement ele1;
	
	@FindBy (xpath="//span[contains(text(),'Upload Video')]")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (id="logoInsertParameters_0_imageX")
	WebElement ele5;
	
	@FindBy (id="logoInsertParameters_0_imageY")
	WebElement ele6;
	
	@FindBy (id="logoInsertParameters_0_imagePath")
	WebElement ele7;
	
	@FindBy (id="logoInsertParameters_0_opacity")
	WebElement ele8;
	
	@FindBy (id="logoInsertParameters_0_startTime")
	WebElement ele9;
	
	@FindBy (id = "logoInsertParameters_0_endTime")
	WebElement ele10;
	
	@FindBy (xpath = "//input[@name='file']")
	WebElement ele11;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ele12;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele13;
	
	@FindBy ( xpath="//span[contains(text(),'Edit')]")
	WebElement ele14;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele15;
	
	@FindBy (id="q")
	WebElement ele16;
	
	
	public void insertAdd(String assetId,  String destinationPath,String logoInsertParameters,String logoInsertParametersimageY, String logoInsertParametersimagePath,String insertParametersOpacity,String logoInsertstartTime,String insertParametersendTime,String sourcePath,By locator) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.sendKeys(logoInsertParameters);
		ele6.sendKeys(logoInsertParametersimageY);
		ele7.sendKeys(logoInsertParametersimagePath);
		ele8.sendKeys(insertParametersOpacity);
		ele9.sendKeys(logoInsertstartTime);
		ele10.sendKeys(insertParametersendTime);
		ele11.sendKeys(sourcePath);
		AbstractComponents ac= new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele12.click();	
	}
	
	public void insertEdit(String destination) {
		ele1.click();
		ele13.click();
		ele14.click();
		ele15.clear();
		ele15.click();
		ele15.sendKeys(destination);
		ele12.click();
	}
	
	public void insertSearch(String asset) {
		ele1.click();
		ele16.sendKeys(asset);
		ele16.sendKeys(Keys.ENTER);
	}
}
