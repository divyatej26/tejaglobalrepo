import org.openqa.selenium.WebDriver;

public class LaunchPage {

public WebDriver launchAmazon()
{
	
WebDriver driver = new ManageWebDriver().getwebdriver();//creating a chrome driver and starting point of test
driver.get("https://www.amazon.com");//go to amazon and load contents
return driver;

}

}
