package Transcoder;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtractFramesPage {
	WebDriver driver;
	public ExtractFramesPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[3]")
	WebElement ele1;
	
	@FindBy (xpath="//span[@aria-label='upload']")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (css="input[type='number']")
	WebElement ele5;
	
	@FindBy(id="endFrame")
	WebElement ele6;
	
	@FindBy (xpath="//input[@name='file']")
	WebElement ele7;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ele8;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele9;
	
	@FindBy (xpath="//span[text()='Edit']")
	WebElement ele10;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele11;
	
	@FindBy (id="q")
	WebElement ele12;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement ele13;
		
	public void extractAdd(String assetId,String destinationPath ,String startNumber,String endFrameNumber) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.sendKeys(startNumber);
		ele6.sendKeys(endFrameNumber);
	}
	
	public void extractSubmit() {
		ele8.click();
	}
	
	public void extractEdit(String destination) {
		ele1.click();
		ele9.click();
		ele10.click();
		ele11.clear();
		ele11.click();
		ele11.sendKeys(destination);		
	}	

	public void extractSearch(String assetValue) {
		ele1.click();
		ele12.sendKeys(assetValue);
		ele13.click();
	}
}
