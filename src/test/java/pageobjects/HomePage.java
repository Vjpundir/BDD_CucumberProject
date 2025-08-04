package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utility.WaitHelper;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	// ########## WebElements ###################

	@FindBy(xpath = "//a[@id='login_Layer']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[text()='Register for free']")
	WebElement registerUser;

	// ############ Action Item ####################

	public void clickLoginOptions() {
		loginBtn.click();
	}

	public void getRegisterUserInfo() {
		WaitHelper.waitForElementVisible(driver, registerUser, 3);
	}

}
