package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.IdentifySceneChange;
import Transcoder.Login;

public class IdentifySceneChangesAdd extends IdentifySceneChange {
	
	public IdentifySceneChangesAdd(WebDriver driver) {
		super(driver);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("Automatio01@maildrop.cc","Password@123");
		IdentifySceneChange isc= new IdentifySceneChange(driver);
		isc.sceneChange("SceneChange"+i,"1","C:\\Users\\Documents\\New folder", "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4",locator);
		
	}
	
}
