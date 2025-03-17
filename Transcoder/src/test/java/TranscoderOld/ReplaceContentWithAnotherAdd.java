package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class ReplaceContentWithAnotherAdd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		la.goTo();
		la.LoginApplication("Automation001@maildrop.cc", "Test@123");
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[14]")).click();
		driver.findElement(By.xpath("//span[normalize-space(text())='Upload Video']")).click();
		driver.findElement(By.id("assetId")).sendKeys("abc");
		driver.findElement(By.id("destinationPath")).sendKeys("C:\\Users\\Documents\\New folder");
		driver.findElement(By.id("alternateContentPath")).sendKeys("alternateContentPath");
		driver.findElement(By.id("startPosition")).sendKeys("00:00:10");
		driver.findElement(By.id("duration")).sendKeys("00:00:20");
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//span[normalize-space(text())='Process Content']")).click();

	}

}
