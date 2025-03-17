package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import Transcoder.ReplaceContentSearch;

public class ReplacePartContentSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String content = "Asset003";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		String userName = "Automatio01@maildrop.cc" , password =  "Password@123";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(userName, password);
		ReplaceContentSearch rcs = new ReplaceContentSearch(driver);
		rcs.ReplaceContent(content);
	}
}
