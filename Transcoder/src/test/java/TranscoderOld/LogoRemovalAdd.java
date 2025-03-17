package TranscoderOld;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.Login;
import transc.AbstractComponents.AbstractComponents;

public class LogoRemovalAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
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
		String logoRemovalstartTime="00:00:30",logoRemovalduration="00:00:50";
		String logoRemovalParametersimageH = "1",logoRemovalParametersimageW="2";
		String logoRemovalParameters = "2",logoRemovalParametersimageY="4";
		String sourcePath= "C:\\Users\\avinash.pallsetti\\Downloads\\sampleVideo.mp4";
		driver.findElement(By.xpath("(//button[@class=\"hoverable-button\"])[9]")).click();
		driver.findElement(By.xpath("//button[@class='ant-btn css-cdzvx5 ant-btn-primary ant-btn-color-primary ant-btn-variant-solid uploadBtn']")).click();
		driver.findElement(By.id("assetId")).sendKeys(assetId);
		driver.findElement(By.id("destinationPath")).sendKeys(destinationPath);
		driver.findElement(By.id("logoRemovalParameters_0_imageX")).sendKeys(logoRemovalParameters);
		driver.findElement(By.id("logoRemovalParameters_0_imageY")).sendKeys(logoRemovalParametersimageY);
		driver.findElement(By.id("logoRemovalParameters_0_imageH")).sendKeys(logoRemovalParametersimageH);
		driver.findElement(By.id("logoRemovalParameters_0_imageW")).sendKeys(logoRemovalParametersimageW);
		driver.findElement(By.id("logoRemovalParameters_0_startTime")).sendKeys(logoRemovalstartTime);
		driver.findElement(By.id("logoRemovalParameters_0_duration")).sendKeys(logoRemovalduration);
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys(sourcePath);
		AbstractComponents ac = new AbstractComponents(driver);
		ac.visibiltyOfElement(locator);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
