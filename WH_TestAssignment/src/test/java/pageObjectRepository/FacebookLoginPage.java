package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookLoginPage {

	WebDriver driver;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	public By uName = By.id("email");
	public By pwd = By.id("pass");	
	public By loginBtn = By.name("login");
	
}
