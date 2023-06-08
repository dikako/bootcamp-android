package stockbit.test.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import stockbit.test.android_driver.AndroidDriverInstance;

public class BasePageObject {

    public AndroidDriver driver() {
        return AndroidDriverInstance.androidDriver;
    }

    public void inputText(By element, String text) {
        driver().findElement(element).sendKeys(text);
    }

    public void tap(By element) {
        driver().findElement(element).click();
    }

    public void isDisplayed(By element) {
        driver().findElement(element).isDisplayed();
    }
}
