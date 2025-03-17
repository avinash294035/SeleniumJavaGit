package Transcoder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MuxSearch {
	WebDriver driver = new ChromeDriver();
	
	public MuxSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//button[@class=\"hoverable-button\"])[1]")
	WebElement ele2;
	
	@FindBy (css ="input[placeholder='Search by Asset ID']")
	WebElement ele10;
	
	@FindBy (xpath="//span[@aria-label='search']")
	WebElement ele11;
	
	public void muxSearchAction(String searchData){
	ele2.click();
	ele10.sendKeys(searchData);
	ele11.click();
	}

	
}
