package Transcoder;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExtractAudioPage{
	WebDriver driver;
	public ExtractAudioPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="(//button[@class='hoverable-button'])[4]")
	WebElement ele1;	
	
	@FindBy (className= "anticon-upload")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
		
	@FindBy (className="ant-select-selector")
	WebElement ele5;
	
	@FindBy(xpath="//input[@name='file']")
	WebElement ele6;
	
	@FindBy (xpath ="//button[@type='submit']")
	WebElement ele7;
	
	@FindBy(css="div[title='aac'] div[class='ant-select-item-option-content']")
	WebElement ele8;
	
	
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele9;
	
	@FindBy (xpath="//span[contains(text(),'Edit')]")
	WebElement ele10;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele11;
	
	@FindBy (id="q")
	WebElement ele12;
	
	@FindBy (xpath="(//span[@role='img'])[5]")
	WebElement ele13;
	
	
	public void audioAdd(String assetId,String destinationPath,String sourcePath) {	
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.click();
		ele6.sendKeys(sourcePath);
	}
	
	public void audioVisibilityElementClick() {
		ele8.click();
	}

	public void audioProcessClick() {
		ele7.click();
		
	}
	
	
	public void audioEdit(String destination) {
	ele1.click();
	ele9.click();
	ele10.click();
	ele11.click();
	ele11.clear();
	ele11.sendKeys(destination);
	ele7.click();
		

	}
	
	public void audioSearch(String assetId) {
		ele1.click();
		ele12.sendKeys(assetId);
		ele13.click();
		
	}
}
