package stockbit.test.page_object;

import org.openqa.selenium.By;
import stockbit.test.base.BasePageObject;

public class LoginPage extends BasePageObject {

    public void clickLoginEntryPoint() {
        isDisplayed(By.id("com.stockbit.android:id/ivFragmentStreamCompanyLogo"));
        tap(By.id("com.stockbit.android:id/btnWellcomeLogIn"));
    }

    public void inputUsername(String username) {
        inputText(By.xpath("(//android.widget.EditText[contains(@resource-id, 'tiet_text_field_input')])[1]"), username);
    }

    public void inputPassword(String password) {
        inputText(By.xpath("(//android.widget.EditText[contains(@resource-id, 'tiet_text_field_input')])[2]"), password);
    }

    public void clickButtonLogin() {
        tap(By.id("com.stockbit.android:id/btn_login"));
    }
}
