package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.IdentifyKeySearch;
import Transcoder.Login;

public class IdentifyKeyFramesSearch extends IdentifyKeySearch{
	public IdentifyKeyFramesSearch(WebDriver driver) {
	super(driver);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		String userName = "Automatio01@maildrop.cc" , password =  "Password@123";
		String searchData = "assetId001";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(userName, password);
		IdentifyKeySearch ikfs = new IdentifyKeySearch(driver);
		ikfs.IdentifyKey(searchData);		
	}
}
