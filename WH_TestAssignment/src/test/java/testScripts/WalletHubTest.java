package testScripts;

import org.testng.annotations.Test;
import functions.AddRandomString;
import genericLib.Browser;
import genericLib.Constant;
import genericLib.WebDriverWaitCommands;
import pageObjectRepository.WalletHub_LoginPage;
import pageObjectRepository.WalletHub_ProfilePage;
import pageObjectRepository.WalletHub_TestInsuranceCompanyPage;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class WalletHubTest {
	WebDriver driver;
	WalletHub_TestInsuranceCompanyPage whti;
	WalletHub_LoginPage wlp;
	WalletHub_ProfilePage whpp;
	WebDriverWaitCommands waitCommands;
	Actions act;
  
  @BeforeTest
  public void beforeTest() {
	  driver = Browser.getBrowser();
	  whti = new WalletHub_TestInsuranceCompanyPage(driver);
	  wlp = new WalletHub_LoginPage(driver);
	  whpp = new WalletHub_ProfilePage(driver);
	  waitCommands = new WebDriverWaitCommands(driver);
	  act = new Actions(driver);
  }
  @Test
  public void validateReviewAddedinTestInsuranceCompany() {
	  // Add Review to TestInsuranceCompany
	  driver.get(Constant.walletHubProfileLink);
	  waitCommands.pageLoadTimeoutWait();
	  waitCommands.webDriverExplicitWaitlocator(whti.rate4ReviewStar);	  
	  act.moveToElement(driver.findElement(whti.rate4ReviewStar)).perform();
	  boolean fourthColorReviewhoverdisplayed = driver.findElement(whti.rate4ReviewStarColordisplay).isDisplayed();
	  System.out.println(fourthColorReviewhoverdisplayed);
	  Assert.assertTrue(fourthColorReviewhoverdisplayed, "Review hover Color not displayed");
	  driver.findElement(whti.rate4ReviewStar).click();
	  waitCommands.webDriverExplicitWaitlocator(whti.testInsuranceDropdown);
	  driver.findElement(whti.testInsuranceDropdown).click();
	  driver.findElement(whti.healthInsuranceOptionValue).click();
	  String randomValue = AddRandomString.randomStringValue(200);
	  driver.findElement(whti.textWriteReview).click();
	  driver.findElement(whti.textWriteReview).sendKeys(randomValue);
	  driver.findElement(whti.submitButton).click();
	  waitCommands.pageLoadTimeoutWait();
	  
	  //Login Page
	  waitCommands.webDriverExplicitWaitlocator(wlp.loginTab);
	  driver.findElement(wlp.loginTab).click();
	  driver.findElement(wlp.emailid).sendKeys(Constant.walletHubUserid);
	  driver.findElement(wlp.pwd).sendKeys(Constant.walletHubPwd);
	  driver.findElement(wlp.loginBtn).click();
	  waitCommands.pageLoadTimeoutWait();


	  //Validate the Added Review
	  waitCommands.webDriverExplicitWaitlocator(whpp.yourReview);
	  boolean yourReviewDisplayed = driver.findElement(whpp.yourReview).isDisplayed();
	  Assert.assertTrue(yourReviewDisplayed, "Added review not displayed");	  
	  String getYourReviewText = driver.findElement(whpp.yourReviewText).getText();
	  System.out.println(getYourReviewText);
	  Assert.assertEquals(getYourReviewText, randomValue, "Added Random Value in Review is not same");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
