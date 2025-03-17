package Transcoder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IdentifyKeySearch {
	WebDriver driver;
	public IdentifyKeySearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath="(//button[@class=\"hoverable-button\"])[13]")
	WebElement element1;
	
	@FindBy(id="q")
	WebElement element2;
	
	@FindBy (xpath="(//button[@type='button'])[3]")
	WebElement element3;
	
	public void IdentifyKey(String searchData) {
		element1.click();
		element2.sendKeys(searchData);
		element3.click();
	}

}
