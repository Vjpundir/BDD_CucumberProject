package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	// ###### Web Elements ##############################

	@FindBy(xpath = "//input[@placeholder='Enter your active Email ID / Username']")
	WebElement userName;

	@FindBy(xpath = "//input[@placeholder='Enter your password']")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//a[@class='nI-gNb-header__logo nI-gNb-company-logo']")
	WebElement appLogo;

	// ################## Actions #############################

	public void enterLoginDetails(String uname, String pwd) {
		userName.sendKeys(uname);
		password.sendKeys(pwd);

	}

	public void clickSubmitBtn() {

		submitButton.click();
	}

	public boolean isLogoDisplay() {
		return appLogo.isDisplayed();
	}

}
