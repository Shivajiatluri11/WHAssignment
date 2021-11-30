package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import genericLib.Browser;
import genericLib.Constant;
import genericLib.WebDriverWaitCommands;
import pageObjectRepository.FacebookCreatePostPage;
import pageObjectRepository.FacebookLoginPage;

public class FacebookAddStatusPostTest {
  
	WebDriver driver;
	FacebookLoginPage faclogin;
	FacebookCreatePostPage facCreatePost;
	WebDriverWaitCommands waitCommands;
  @BeforeTest
  public void beforeTest() {
	  driver = Browser.getBrowser();
	  faclogin = new FacebookLoginPage(driver);
	  facCreatePost = new FacebookCreatePostPage(driver);
	  waitCommands = new WebDriverWaitCommands(driver);
	  
  }
	@Test
  public void addStatusInFacebookTest() {
		driver.get(Constant.facebookurl);
		driver.findElement(faclogin.uName).sendKeys(Constant.facebookmailid);
		driver.findElement(faclogin.pwd).sendKeys(Constant.facebookPwd);
		driver.findElement(faclogin.loginBtn).click();
		waitCommands.pageLoadTimeoutWait();
		waitCommands.webDriverExplicitWaitlocator(facCreatePost.homebtn);
		driver.findElement(facCreatePost.homebtn).click();
		waitCommands.webDriverExplicitWaitlocator(facCreatePost.statusBtn);
		driver.findElement(facCreatePost.statusBtn).click();
		waitCommands.pageLoadTimeoutWait();
		waitCommands.webDriverExplicitWaitlocator(facCreatePost.enterstatus);
		driver.findElement(facCreatePost.enterstatus).sendKeys("Hello World");
		driver.findElement(facCreatePost.postBtn).click();
		
  }
	
	 @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }
}
