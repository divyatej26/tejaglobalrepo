import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginDetails {
	public WebDriver loginfo(WebDriver driver){
		WebElement search4=driver.findElement(By.id("ap_email"));
		search4.sendKeys("divyagovardhan.kandula@gmail.com");
		WebElement search5=driver.findElement(By.id("ap_password"));
		search5.sendKeys("Asd@12345");
		
		WebElement search6=driver.findElement(By.id("signInSubmit"));
		search6.click();
		return driver;
	}

}
