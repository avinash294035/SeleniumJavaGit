package Transcoder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MuxEdit {
	WebDriver driver;
	
	public MuxEdit(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath="(//span[@class=\'ant-btn-icon\'])[2]")
	WebElement ele13;
	
	@FindBy(xpath="//span[Contains(text(),'Edit')]")
	WebElement ele14;
	
	public void MuxEditAction(){
		ele13.click();
		ele14.click();
	}



	

}
