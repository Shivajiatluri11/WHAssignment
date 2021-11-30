package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WalletHub_TestInsuranceCompanyPage {

	WebDriver driver;
	public WalletHub_TestInsuranceCompanyPage(WebDriver driver) {
		this.driver =driver;
	}
	
	public By rate4ReviewStar = By.cssSelector("div[class*='rv review-action ng-enter-element']>review-star >div>svg:nth-child(7) ");
	public By rate4ReviewStarColordisplay = By.cssSelector("div[class*='rv review-action ng-enter-element']>review-star >div>svg:nth-child(7) >g >path[stroke =\"#4ae0e1\"]");
	public By testInsuranceDropdown = By.xpath("(//span[@class='dropdown-placeholder' and contains(text(),'Select')])");
	public By healthInsuranceOptionValue = By.xpath("//li[contains(text(),'Health Insurance')]");
	public By textWriteReview = By.xpath("//textarea[contains(@placeholder,'Write your review')]");
	public By submitButton = By.xpath("//div[contains(text(),'Submit')]");
	
}
