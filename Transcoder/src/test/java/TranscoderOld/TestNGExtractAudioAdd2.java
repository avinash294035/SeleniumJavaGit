package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Transcoder.Login;

public class TestNGExtractAudioAdd2 {

	
	
	   
	    @Test(dataProvider = "DataPassValues")
		public void ExtractAudio(String username,String password){
//		int i =1	;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		String assetId = "audio"+i;
//		String destinationPath = "C:\\Users\\Documents\\New folder";
// 		String dropDownOption = "AAC";
//		String sourcePath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
//		By locator =  By.xpath("//span[@role='img']");
//		By locator1 = By.cssSelector(("div[title='aac'] div[class='ant-select-item-option-content']"));
		Login la = new Login(driver);
		la.goTo();
		/*la.LoginApplication(username, password);
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[4]")).click();
		driver.findElement(By.className("anticon-upload")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.className("ant-select-selector")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
		ele.click();
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
//		TestNGExtractAudioAdd2 ea =new TestNGExtractAudioAdd2(driver);		
//		ea.visibiltyOfElement(locator);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();	*/
		
	}
	    
	
}