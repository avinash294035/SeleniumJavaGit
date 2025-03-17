package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;

public class TranscodingAdd extends AbstractComponents {
	
	public TranscodingAdd(WebDriver driver){
		super(driver);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));	
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("Automation001@maildrop.cc", "Test@123");
		String assetId = "abcd"+i;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String outputGroupswidth= "2",outputGroupsHeight="3";
		String outputGroupsBitrate= "4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[12]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("outputGroups_0_width")).sendKeys(outputGroupswidth);
		driver.findElement(By.id("outputGroups_0_height")).sendKeys(outputGroupsHeight);
		driver.findElement(By.xpath("//input[@type='search']")).click();
		By element4 = (By.xpath("//div[@title='High']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element4));
		driver.findElement(element4).click();
		driver.findElement(By.id("outputGroups_0_bitrate")).sendKeys(outputGroupsBitrate);
		driver.findElement(By.id("outputGroups_0_destinationPath")).sendKeys(destinationPath);
		//input[@id='outputGroups_0_qualityFactor']		
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
