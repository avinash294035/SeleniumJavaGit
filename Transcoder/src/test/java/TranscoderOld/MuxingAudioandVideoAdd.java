package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;

public class MuxingAudioandVideoAdd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Chrome\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("automation001@maildrop.cc", "Test@123");
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[15]")).click();
		driver.findElement(By.xpath("//span[normalize-space(text())='Upload Video']")).click();
		driver.findElement(By.id("assetId")).sendKeys("AudioAndVideo");
		driver.findElement(By.id("destinationPath")).sendKeys("C:\\Users\\Documents\\New folder");
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4");
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//span[normalize-space(text())='Process Content']")).click();
		
		

	}

}
