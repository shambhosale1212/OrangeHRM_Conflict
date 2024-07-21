package Steps;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageTest extends BaseClass {
	private static LoginPage loginPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		BaseClass.initialization();

	}

	@When("user enter valid credentials")
	public void user_enter_valid_credentials() {

		loginPage = new LoginPage();
		loginPage.loginpageFun("Admin", "admin123");

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {

		loginPage.clickLogin();

	}

}
