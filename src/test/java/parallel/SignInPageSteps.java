package parallel;

import com.pages.SignInPage;
import com.qa.factory.DriverFactory;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps {

	private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());

	@Given("user enter valid {string}")
	public void user_enter_valid_email_id(String emailid) {
		signInPage.enterEmailId(emailid);
	}

	@When("user clicks on next button")
	public void user_clicks_on_next_button() {
		signInPage.clickOnNextButton(Integer.parseInt(ApplicationHooks.getTimeOutValue()));
	}

	@Then("user enter {string}")
	public void user_enter_password(String password) {
		signInPage.enterPassword(password,Integer.parseInt(ApplicationHooks.getTimeOutValue()));
	}

	@Then("user clicks on the next button")
	public void user_clicks_on_the_next_button() {
		signInPage.clickOnNextButton(Integer.parseInt(ApplicationHooks.getTimeOutValue()));
	}

	@Given("user is on SignIn page")
	public void user_is_on_accounts_page() {
		String title = signInPage.getSignInPageTitle();
		System.out.println("Page title is: " + title);
	}
}