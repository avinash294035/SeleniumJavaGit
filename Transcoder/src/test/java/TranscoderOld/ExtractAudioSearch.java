package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Transcoder.Login;

@Test
public class ExtractAudioSearch {
	@Test
	 public void ExtractAudio(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));		
		String userName = "Automatio03@maildrop.cc", password = "Password@123";
		String assetId = "Asset002";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(userName, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[4]")).click();
		driver.findElement(By.id("q")).sendKeys(assetId);
		driver.findElement(By.xpath("(//span[@role='img'])[5]")).click();
	}

}
