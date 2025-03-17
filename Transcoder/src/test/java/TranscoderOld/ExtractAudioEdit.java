package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Transcoder.Login;
@Test
public class ExtractAudioEdit {
	@Test(groups= {"smoke"})
	public void extractAudio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String destination ="/in";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String user = "Automatio03@maildrop.cc", password = "Password@123";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(user, password);
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ant-btn-icon'])[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		WebElement ele3 = driver.findElement(By.xpath("//input[@placeholder='Enter Destination Path']"));
		ele3.clear();
		ele3.click();
		ele3.sendKeys(destination);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
