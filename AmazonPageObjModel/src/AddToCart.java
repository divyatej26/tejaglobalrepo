import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
	public WebDriver add(WebDriver driver){
		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		return driver;
	}

}
