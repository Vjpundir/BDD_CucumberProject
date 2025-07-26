package stepdefinitions;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basetest.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class HomePageSteps {

	HomePage homePage;
	

	@Given("User navigate to home page")
	public void User_navigate_to_login_page() throws InterruptedException {
		Hooks.driver.get("https://www.naukri.com/");
		Thread.sleep(3000);
	}

	@When("User click on login button")
	public void User_click_on_login_button() throws InterruptedException {
		homePage = new HomePage(Hooks.driver);
		homePage.clickLoginOptions();
		Thread.sleep(3000);
	}

	@Then("User see register free user text successfully")
	public void User_see_register_free_user_text_successfully() {
		WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Register for free']")));
		System.out.println("user see register free user text successfully");
	}

}
