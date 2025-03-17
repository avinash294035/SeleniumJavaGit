package Transcoder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;


public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
				 
	}
	@BeforeTest
	public void goTo() {
		driver.get("https://transcoderdev.engro.in/login");
	}
	
	@FindBy (id="username")
	WebElement user;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(className="ant-btn-block")
	WebElement buttonClick;
	
	public void LoginApplication(String name,String userPassword) {
		user.sendKeys(name);
		pwd.sendKeys(userPassword);
		buttonClick.click();
	}
	

}
