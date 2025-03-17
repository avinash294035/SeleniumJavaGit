package TranscoderOld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.ExtractFrameSearch;
import Transcoder.Login;

public class ExtractingFramesSearch extends ExtractFrameSearch{
	
	public ExtractingFramesSearch(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String userName = "Automatio01@maildrop.cc" , password =  "Password@123";
		String assetData = "Asset004";
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication(userName,password);
		ExtractFrameSearch efs= new ExtractFrameSearch(driver);
		efs.ExtractSearch(assetData);
//		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[3]")).click();
//		driver.findElement(By.id("q")).sendKeys("Asset004");
//		driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();
		
	}

}
