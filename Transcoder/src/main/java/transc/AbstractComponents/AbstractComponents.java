package transc.AbstractComponents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AbstractComponents {

		WebDriver driver;
		public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
			
		}
		
		public void visibiltyOfElement(By locator) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
		}

		public void ElementToBeClickable(By ele9) {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
			wait.until(ExpectedConditions.elementToBeClickable(ele9));	
		}
		
}


