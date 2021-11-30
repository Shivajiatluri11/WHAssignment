package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHub_ProfilePage {
	WebDriver driver;
	public WalletHub_ProfilePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By userTitle = By.xpath("(//span[@class='brgm-list-title'])[3]");
	public By clickProfile = By.xpath("//a[text() = 'Profile']");
	public By linkTestInsuranceCompany = By.linkText("Test Insurance Company");
	public By yourReview = By.xpath("//span[contains(text(),'Your Review')]");
	public By yourReviewText = By.xpath("//span[contains(text(),'Your Review')]/ancestor::article/div[5]");

	
}
