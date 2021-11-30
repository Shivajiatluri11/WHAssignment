package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitCommands {
	
	WebDriver driver;
	public WebDriverWaitCommands(WebDriver driver) {
		this.driver = driver;
	}
	
	public void webDriverExplicitWaitlocator(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	public void pageLoadTimeoutWait() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	

}
