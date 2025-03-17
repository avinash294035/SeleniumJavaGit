package Transcoder;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import transc.AbstractComponents.AbstractComponents;

public class MuteAudioPage {
	
	WebDriver driver;
	
	public MuteAudioPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="(//button[@class='hoverable-button'])[7]")
	WebElement ele1;
	
	@FindBy (xpath="(//button[@type='button'])[4]")
	WebElement ele2;
	
	@FindBy (id="assetId")
	WebElement ele3;
	
	@FindBy (id="destinationPath")
	WebElement ele4;
	
	@FindBy (id="muteAudioParameters_0_startTime")
	WebElement ele5;
	
	@FindBy (id="muteAudioParameters_0_endTime")
	WebElement ele6;
	
	@FindBy (xpath="//input[@name='file']") 
	WebElement ele7;
	
	@FindBy (xpath="//button[@type='submit']")
	WebElement ele8;
	
	@FindBy (xpath="(//span[@class='ant-btn-icon'])[2]")
	WebElement ele9;
	
	@FindBy (xpath="//span[contains(text(),'Edit')]")
	WebElement ele10;
	
	@FindBy(xpath="//input[@placeholder='Enter Destination Path']")
	WebElement ele11;
	
	
	
	
	public void muteAudioAdd(String assetId,String destinationPath,String startTime,String endTime,String sourcePath,By locator) {
		ele1.click();
		ele2.click();
		ele3.sendKeys(assetId);
		ele4.sendKeys(destinationPath);
		ele5.sendKeys(startTime);
		ele6.sendKeys(endTime);
		ele7.sendKeys(sourcePath);
		AbstractComponents ac= new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		ele8.click();
		
	}
	
	public void muteAudioEdit(String destination) {
		ele1.click();
		ele9.click();
		ele10.click();
		ele11.clear();
		ele11.click();
		ele11.sendKeys(destination);
		ele8.click();
	}
	
//	driver.findElement(By.xpath("(//button[@class='hoverable-button'])[7]")).click();
//	driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
//	driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
//	WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
//	ele3.clear();
//	ele3.click();
//	ele3.sendKeys(destination);
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
//	driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[7]")).click();
//	driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
//	driver.findElement(By.id("assetId")).sendKeys(assetId);
//	driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
//	driver.findElement(By.id("muteAudioParameters_0_startTime")).sendKeys(startTime);
//	driver.findElement(By.id("muteAudioParameters_0_endTime")).sendKeys(endTime);
//	driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
