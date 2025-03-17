package TranscoderOld;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class ExtractingFramesAdd extends Login {
	WebDriver driver;
	public ExtractingFramesAdd(WebDriver driver) {
		super(driver);
		
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		int i=1;
		Login la = new Login(driver);
		String assetId = "abc"+i;
		String destinationPath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		By locator = By.xpath("//span[@role='img']");
		la.goTo();
		la.LoginApplication("automatio01@maildrop.cc", "Password@123");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[3]")).click();
		driver.findElement(By.xpath("//span[@aria-label=\"upload\"]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.cssSelector("input[type=\"number\"]")).sendKeys("00:50");
		driver.findElement(By.id("endFrame")).sendKeys("00:55");
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			

	}

}
