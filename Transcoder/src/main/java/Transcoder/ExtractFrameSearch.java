 package Transcoder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExtractFrameSearch {
	WebDriver driver;
	public ExtractFrameSearch(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[3]")
	WebElement element1;
	
	@FindBy (id="q")
	WebElement element2;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement element3;
	

	public void ExtractSearch(String assetValue) {
		element1.click();
		element2.sendKeys(assetValue);
		element3.click();
	}


}
