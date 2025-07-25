package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// ########## WebElements ###################

	@FindBy(xpath = "//a[@id='login_Layer']")
	WebElement loginBtn;

	
	//############ Action Item  ####################
	
	public void clickLoginOptions() {
		loginBtn.click();
	}

}
