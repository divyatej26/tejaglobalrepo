import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWebDriver {
	public WebDriver getwebdriver(){
		WebDriver driver=null;
	    System.setProperty("webdriver.chrome.driver", "C://Users//divya//Downloads//chromedriver_win32//chromedriver.exe");
	    driver = new ChromeDriver();
	    return driver;
	}

}

