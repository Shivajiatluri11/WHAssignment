package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHub_LoginPage {
	WebDriver driver;
	public WalletHub_LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By loginTab = By.linkText("Login");
	public By emailid = By.xpath("//input[@placeholder = 'Email Address']");
	public By pwd = By.xpath("//input[@placeholder = 'Password']");
	public By loginBtn = By.xpath("//span[text() = 'Login']");
}
