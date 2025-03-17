package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class GenerateThumbnailsAdd extends Login{
	
	public GenerateThumbnailsAdd(WebDriver driver) {
		super(driver);
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		int i=1;
		Login la = new Login(driver);
		String assetId = "GenerateThumbnails"+i;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String timeStamp= "1";
		String timeStamp1= "00:00:10";
		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		la.goTo();
		la.LoginApplication("Automatio01@maildrop.cc", "Password@123");
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[6]")).click();
		driver.findElement(By.cssSelector("span[aria-label='upload']")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		WebElement element = driver.findElement(By.id("multiThumbnail"));
		WebElement element3 = driver.findElement(By.xpath("//button[@aria-checked='false']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		if(element.isEnabled() && element3.isSelected()) {
        	WebElement element1=driver.findElement(By.className("ant-input-number-input"));
    		wait.until(ExpectedConditions.elementToBeClickable(element1));
			element1.sendKeys(timeStamp);
        }
        else {
        	WebElement element2=driver.findElement(By.id("timeStamp"));
    		wait.until(ExpectedConditions.elementToBeClickable(element2));
			element2.sendKeys(timeStamp1);
        }
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
