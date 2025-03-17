package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;

public class ReplaceTextAdd extends AbstractComponents {
	WebDriver driver;
	public ReplaceTextAdd(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}
	
		public static void main(String[] args) throws InterruptedException {
		int i=1;
		while(i<=1) {
		String assetId = "abc"+i;
		String destinationPath = "C:\\Users\\Documents\\New folder";
		String alternateContentPath = "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		String sourcePath = " C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		By locator = By.xpath("//div[@class='ant-message-notice-content']");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		Login la = new Login(driver);
		la.goTo();
		la.LoginApplication("automation001@maildrop.cc", "Test@123");
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[2]")).click();
		driver.findElement(By.xpath("(//button[@type=\"button\"])[4]")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("alternateContentPath")).sendKeys(alternateContentPath);
		driver.findElement(By.id("startPosition")).sendKeys("00:00:30");
		driver.findElement(By.id("duration")).sendKeys("00:00:50");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		i++;
	}

	}

}
