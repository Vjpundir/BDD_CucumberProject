package stepdefinitions;


import basetest.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginSteps {

	LoginPage loginpage;
	

	@Given("User navigate to login page")
	public void User_navigate_to_login_page() {
		Hooks.driver.get("https://www.naukri.com/");
	}

	@When("User click on login button")
	public void User_click_on_login_button() {
		loginpage = new LoginPage(Hooks.driver);
		loginpage.clickLoginOptions();
	}

	@Then("User login button successfully")
	public void User_login_button_successfully() {
		System.out.println("user click login button");
	}

}
