package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	
	public static WebDriver driver;
		
	public static WebDriver getBrowser()
	{
		if(Constant.browser.equals("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\BrowserDriver\\chromedriver.exe");
			
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			
		}		
		return driver;
	}

}
