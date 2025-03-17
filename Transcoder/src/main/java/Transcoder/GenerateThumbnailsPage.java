package Transcoder;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenerateThumbnailsPage {
	WebDriver driver;
	public GenerateThumbnailsPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[6]")
	WebElement ele1;
	
	@FindBy (xpath="//span[@aria-label='upload']")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (id="multiThumbnail")
	WebElement ele5;
	
	@FindBy(xpath="//button[@aria-checked='false']")
	WebElement ele6;
	
	@FindBy (className = "ant-input-number-input")
	WebElement ele7;
	
	@FindBy(id="timeStamp")
	WebElement ele8;
	
	@FindBy (xpath="//input[@name='file']")
	WebElement ele9;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement ele10;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele11;
	
	@FindBy (xpath="//span[contains(text(),'Edit')]")
	WebElement ele12;
	
	@FindBy (xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele13;
	
	@FindBy (id="q")
	WebElement ele14;
	
	public void generateAdd(String assetId,String destinationPath) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
	}

	public void enterTimeStamp(String timeStamp,String timeStamp1) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		if(ele5.isEnabled() && ele6.isSelected()) {
			wait.until(ExpectedConditions.elementToBeClickable(ele7));
			ele7.sendKeys(timeStamp);
	    }
	    else {
			wait.until(ExpectedConditions.elementToBeClickable(ele8));
			ele8.sendKeys(timeStamp1);
	    }
	}
	
	public void fileUpdate(String sourcePath){
		ele9.sendKeys(sourcePath);
	}
	
	public void generateSubmit() {
		ele10.click();
	}
	
	public void generateEdit(String destination) {
		ele1.click();
		ele11.click();
		ele12.click();
		ele13.clear();
		ele13.click();
		ele13.sendKeys(destination);
	}
	
	public void geneateSearch(String assetId) {
		ele1.click();
		ele14.sendKeys(assetId);
		ele14.sendKeys(Keys.ENTER);
	}
}
