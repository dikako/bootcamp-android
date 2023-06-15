package stockbit.test.page_object;

import stockbit.test.base.BasePageObject;

public class LoginPage extends BasePageObject {

    public void clickLoginEntryPoint() {
        isDisplayed("COMPANY_LOGO");
        tap("ENTRY_POINT_LOGIN");
    }

    public void inputUsername(String username) {
        inputText("FIELD_USERNAME", usernameasdasadgdsgsdgsdgdgs);
    }

    public void inputPassword(String password) {
        inputText("FIELD_PASSWORD", passworddgdsggdgsdgs);
    }

    public void clickButtonLogin() {
        tap("BUTTON_LOGIN");
    }
}
