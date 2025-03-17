package transc.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DriverInitialization {
	public  WebDriver driver;
	
	@BeforeMethod(alwaysRun= true)
	public void Initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
		
	
	@AfterMethod(alwaysRun= true)
	public void tearDown() {
		if(driver!=null) {
			driver.close();
			System.out.println("Driver closed successfully");
		}
	}
}
