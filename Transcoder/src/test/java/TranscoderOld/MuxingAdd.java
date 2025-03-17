package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import Transcoder.MuxAdd;


public class MuxingAdd extends Login{

		public MuxingAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
   }

	public static  void main(String[] args) throws InterruptedException {
		int i=401;
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		// TODO Auto-generated method stub
		while(i<=402) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("automation001@maildrop.cc", "Test@123");
		MuxAdd ma= new MuxAdd(driver);
		ma.MuxAction("upload"+i, "C:\\Users\\Documents\\New folder", "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4",locator);
		driver.close();
		i++;
		}
			
	}
	

}
