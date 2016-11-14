import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPage {
	public WebDriver selItem(WebDriver driver)
	{
	WebElement search1=driver.findElement(By.xpath("//li[@id='result_0']//a/h2"));
	search1.click();
	return driver;
	}

}
