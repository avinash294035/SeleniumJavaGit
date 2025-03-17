package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import Transcoder.MuxSearch;
import transc.AbstractComponents.AbstractComponents;

public class MuxingSearch  extends Login {
	public MuxingSearch(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub

	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.manage().window().maximize();
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("chindam57@maildrop.cc", "12345678");
		MuxSearch ms= new MuxSearch(driver);
		ms.muxSearchAction("upload283");
		AbstractComponents ac= new AbstractComponents(driver);
		ac.ElementToBeClickable(By.xpath("//span[@class=\'ant-input-affix-wrapper css-cdzvx5 ant-input-outlined\']"));
		
		//search is working but need to check why new browser is opening

	}

}
