import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProceedCheckout {
	public WebDriver proceed(WebDriver driver) {
		WebElement chkout=driver.findElement(By.id("hlb-ptc-btn-native"));
		chkout.click();
		return driver;
		
	}

}
