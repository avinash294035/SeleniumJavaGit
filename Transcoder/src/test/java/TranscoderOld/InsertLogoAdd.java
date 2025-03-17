package TranscoderOld;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Transcoder.Login;

public class InsertLogoAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		Random ra = new Random();
		int raInt = ra.nextInt();
		Login la= new Login(driver);
		la.goTo();
		la.LoginApplication("Automatio01@maildrop.cc","Password@123");
		String assetId = "Asset"+raInt;
		String destinationPath= "C:\\Users\\Documents\\New folder";
		String logoInsertstartTime="00:00:30",insertParametersOpacity="1",insertParametersendTime="00:00:50";
		String logoInsertParametersimagePath = "folder";
		String logoInsertParameters = "2",logoInsertParametersimageY="4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class='hoverable-button'])[8]]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("logoInsertParameters_0_imageX")).sendKeys(logoInsertParameters);
		driver.findElement(By.id("logoInsertParameters_0_imageY")).sendKeys(logoInsertParametersimageY);
		driver.findElement(By.id("logoInsertParameters_0_imagePath")).sendKeys(logoInsertParametersimagePath);
		driver.findElement(By.id("logoInsertParameters_0_opacity")).sendKeys(insertParametersOpacity);
		driver.findElement(By.id("logoInsertParameters_0_startTime")).sendKeys(logoInsertstartTime);
		driver.findElement(By.id("logoInsertParameters_0_endTime")).sendKeys(insertParametersendTime);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
