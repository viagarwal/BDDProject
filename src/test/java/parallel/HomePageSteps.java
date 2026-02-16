package parallel;

import org.junit.Assert;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import AppHooks.ApplicationHooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private static String title;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		Assert.assertTrue(homePage.isSignDisplay(Integer.parseInt(ApplicationHooks.getTimeOutValue())));
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = homePage.getLoginPageTitle();;
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("gmail link should be displayed")
	public void gmail_link_should_be_displayed() {
		Assert.assertTrue(homePage.isGmailLinkExist(Integer.parseInt(ApplicationHooks.getTimeOutValue())));
	}

	
	@When("user click on SignIn link")
	public void user_clicks_on_SignIn_Link() {
		homePage.doSignIn(Integer.parseInt(ApplicationHooks.getTimeOutValue()));
	}
}