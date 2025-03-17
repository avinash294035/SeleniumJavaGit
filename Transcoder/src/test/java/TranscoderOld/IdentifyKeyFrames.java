package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.IdentifyKeyFrame;
import Transcoder.Login;

public class IdentifyKeyFrames extends IdentifyKeyFrame{
	public IdentifyKeyFrames(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		la.goTo();
		la.LoginApplication("Automatio01@maildrop.cc", "Password@123");
		IdentifyKeyFrame ikf = new IdentifyKeyFrame(driver);
		ikf.KeyFrame("abc"+i, "C:\\Users\\Documents\\New folder", "C:\\Users\\Documents\\New folder","00:00:10","00:00:50","C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4", locator);
		
	}

}
