package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;

public class SplitVideoAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int i=0;
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	By locator = By.xpath("//div[@class='ant-message-notice-content']");
	Login la= new Login(driver);
	la.goTo();
	la.LoginApplication("Automatio01@maildrop.cc", "Password@123");
	String assetId = "abcd"+i;
	String destinationPath= "C:\\Users\\Documents\\New folder";
	String splitVideostartTime= "00:00:50",splitVideoDuration="00:00:59";
	String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
	driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[11]")).click();
	driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
	driver.findElement(By.id("assetId")).sendKeys(assetId);
	driver.findElement(By.id("splitVideoParameters_0_startTime")).sendKeys(splitVideostartTime);
	driver.findElement(By.id("splitVideoParameters_0_duration")).sendKeys(splitVideoDuration);
	driver.findElement(By.id("splitVideoParameters_0_destinationPath")).sendKeys(destinationPath);
	driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
	AbstractComponents ac = new AbstractComponents(driver);
	ac.visibiltyOfElement(locator);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
}