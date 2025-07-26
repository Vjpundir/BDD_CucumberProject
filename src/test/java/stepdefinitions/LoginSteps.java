package stepdefinitions;

import org.junit.Assert;

import basetest.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginSteps {

	LoginPage loginPage;
	HomePage homePage;

	@Given("User is on the Naukri login page")
	public void user_is_on_the_naukri_login_page() throws InterruptedException {

		Hooks.driver.get("https://www.naukri.com/");
		homePage = new HomePage(Hooks.driver);
		homePage.clickLoginOptions();
		Thread.sleep(4000);
		System.out.println("user is on login page pop up window");

	}

	@When("User enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		loginPage = new LoginPage(Hooks.driver);
		loginPage.enterLoginDetails(username, password);
		Thread.sleep(3000);
	}

	@When("User clicks the submit button")
	public void user_clicks_the_submit_button() {

		loginPage.clickSubmitBtn();

	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() throws InterruptedException {
		boolean status = loginPage.isLogoDisplay();
		Assert.assertTrue("Logo is getting display successfully", status);
		Thread.sleep(2000);
		System.out.println("Test is passed");
	}

}
