package Transcoder;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoRemoveSearch {
	WebDriver driver;
	public LogoRemoveSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		
	}
	
		
		@FindBy (xpath = "(//button[@class='hoverable-button'])[9]")
        WebElement ele1;
        
        @FindBy (id="q")
        WebElement ele2;
        
        public void LogoSearch(String assetId) {
        	ele1.click();
        	ele2.sendKeys(assetId);
        	ele2.sendKeys(Keys.ENTER);
        	
        }
        	

}
