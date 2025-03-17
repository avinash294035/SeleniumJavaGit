package TranscoderOld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;

public class Log{
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Login la = new Login(driver);
	la.goTo();
	la.LoginApplication("Automatio03@maildrop.cc", "Password@123");
	driver.manage().window().maximize();
	}
}
