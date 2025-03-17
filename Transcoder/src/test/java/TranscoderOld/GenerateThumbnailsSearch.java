package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;

public class GenerateThumbnailsSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		String userName="Automatio01@maildrop.cc", password ="Password@123";
		String assetId = "Asset005";
		la.goTo();
		la.LoginApplication(userName, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[6]")).click();
		WebElement element = driver.findElement(By.id("q"));
		element.sendKeys(assetId);
		element.sendKeys(Keys.ENTER);
	}

}
