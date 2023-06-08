package step_definitions;

import io.cucumber.java8.En;
import stockbit.test.page_object.LoginPage;

public class LoginSteps implements En {

    LoginPage loginPage = new LoginPage();

    public LoginSteps() {
        Given("User click entry point login", () -> loginPage.clickLoginEntryPoint());

        And("User input username {string}", (String username) -> loginPage.inputUsername(username));

        When("User input password {string}", (String password) -> loginPage.inputPassword(password));

        And("User click login button", () -> loginPage.clickButtonLogin());
    }
}
