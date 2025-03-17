package transcoderNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfigReader {

	String browser;
	WebDriver driver;
	@Test
	public void configReaderMethod() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\avinash.pallsetti\\eclipse-workspace\\Transcoding\\Transcoder\\src\\test\\java\\transcoderNew\\data\\GlobalData.properties");
		if(browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "")	;
		 driver = new ChromeDriver();
		 	
		}
	}
	
	
	
}
