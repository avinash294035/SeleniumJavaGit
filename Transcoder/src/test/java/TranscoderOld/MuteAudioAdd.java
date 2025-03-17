package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class MuteAudioAdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		int i=1;
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication("Automatio01@maildrop.cc","Password@123");
		String assetId = "abcd"+i;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String startTime= "00:00:10";
		String endTime = "00:00:20";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[7]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("muteAudioParameters_0_startTime")).sendKeys(startTime);
		driver.findElement(By.id("muteAudioParameters_0_endTime")).sendKeys(endTime);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
