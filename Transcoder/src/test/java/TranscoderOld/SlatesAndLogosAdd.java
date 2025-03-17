package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class SlatesAndLogosAdd extends Login {
	
	public SlatesAndLogosAdd(WebDriver driver){
		super(driver);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=1;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		la.goTo();
		String assetId = "slatesandlogos"+i;
		String destinationPath = "C:\\Users\\Documents\\New folder",logoImagePath="0" , logoOpacity="0", slatePath="1";String slatesSlatePath = "2";
		String height="2";
		String logoImageY="12";
		String logoDuration="1",logoImageX="0";
		String width="2";
		String logoStartTime="00:00:10";
		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator1= By.cssSelector("div[title='High'] div[class='ant-select-item-option-content']");
		By locator =  By.xpath("//span[@role='img']");
		la.LoginApplication("Automatio01@maildrop.cc", "Password@123");
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[5]")).click();
		driver.findElement(By.xpath("//span[@aria-label=\"upload\"]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("width")).sendKeys(width);
		driver.findElement(By.id("height")).sendKeys(height);
		driver.findElement(By.id("qualityFactor")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
		ele.click();
		driver.findElement(By.id("logos_0_imageX")).sendKeys(logoImageX);
		driver.findElement(By.id("logos_0_imageY")).sendKeys(logoImageY);
		driver.findElement(By.id("logos_0_imagePath")).sendKeys(logoImagePath);
		driver.findElement(By.id("logos_0_opacity")).sendKeys(logoOpacity);
		
		driver.findElement(By.id("logos_0_startTime")).sendKeys(logoStartTime);
		driver.findElement(By.id("logos_0_duration")).sendKeys(logoDuration);
		driver.findElement(By.id("slates_0_startPosition")).click();
		driver.findElement(By.xpath("(//div[@class=\"ant-select-item-option-content\"])[3]")).click();
		driver.findElement(By.id("slates_1_startPosition")).click();
		driver.findElement(By.id("slates_0_slatePath")).sendKeys(slatePath);
		driver.findElement(By.id("slates_1_startPosition")).click();
		driver.findElement(By.xpath("//div[@class=\"ant-select-item ant-select-item-option ant-select-item-option-active\"]/div")).click();
		driver.findElement(By.id("slates_1_slatePath")).sendKeys(slatesSlatePath);
		driver.findElement(By.xpath("//input[@name=\"file\"]")).sendKeys(sourcePath);
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
		

		
		
		
	}

}
