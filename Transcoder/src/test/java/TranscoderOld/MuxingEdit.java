package TranscoderOld;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Transcoder.MuxSearch;

public class MuxingEdit extends MuxingSearch{

	public MuxingEdit(WebDriver driver) {
		super(driver);
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		MuxingSearch ms = new MuxingSearch(driver);
		ms.goTo();
		ms.LoginApplication("chindam57@maildrop.cc", "12345678");
		MuxSearch ms1 = new MuxSearch(driver);
		ms1.muxSearchAction("upload281");
//		ms1.muxSearchAction2("Keys.ENTER");
		
		
		//td[@class='ant-table-cell ant-table-cell-row-hover']//span[@aria-label='more']//*[name()='svg']
	
		}

}
