package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class TranscodingSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String user = "Automatio01@maildrop.cc",password="Password@123",asset="Asset001";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(user, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[12]")).click();
		WebElement element = driver.findElement(By.id("q"));
		By locator = By.xpath("//td[text()='Asset001']");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		element.sendKeys(asset);
		element.sendKeys(Keys.ENTER);	

	}

}
