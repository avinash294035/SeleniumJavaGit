package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;

public class InsertLogoSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String user = "Automatio01@maildrop.cc",password="Password@123",asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(user, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[8]")).click();
		WebElement element = driver.findElement(By.id("q"));
		element.sendKeys(asset);
		element.sendKeys(Keys.ENTER);	
		

	}

}
