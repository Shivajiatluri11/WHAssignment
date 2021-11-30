package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookCreatePostPage {
	
	WebDriver driver;
	public FacebookCreatePostPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By homebtn = By.xpath("//a[@aria-label='Home']");
	public By statusBtn = By.xpath("//span[contains(text(),\"What's on your mind\")]");
	public By enterstatus = By.xpath("//div[@class = '_1mf _1mj']");
	public By postBtn = By.xpath("//span[text()='Post']");
	
}
