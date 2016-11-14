import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver search(WebDriver driver){
		WebElement enter=driver.findElement(By.id("twotabsearchtextbox"));
		enter.sendKeys("Iphone case");
		WebElement page1 = driver.findElement(By.className("nav-input"));
		page1.click();
		return driver;	
	}

}
