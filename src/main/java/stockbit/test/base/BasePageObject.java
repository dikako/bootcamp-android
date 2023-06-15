package stockbit.test.base;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import stockbit.test.android_driver.AndroidDriverInstance;
import stockbit.test.utils.Utils;

import java.util.Objects;

public class BasePageObject {

    Dotenv env = Dotenv.load();

    public AndroidDriver driver() {
        return AndroidDriverInstance.androidDriver;
    }

    public By element(String elementLocator) {
        String elementValue = Utils.ELEMENTS.getProperty(elementLocator);

        if (elementValue == null) {
            throw new NoSuchElementException("Element gak ada bro!" + elementLocator);
        } else {
            String[] locator = elementValue.split("_"); // [id, element]
            String locatorType = locator[0]; // id
            String locatorValue = elementValue.substring(elementValue.indexOf("_") + 1); // element
            switch (locatorType) {
                case "id":
                    if (Objects.equals(env.get("ENV"), "prod")) {
                        return By.id("com.stockbit.android:id/" + locatorValue);
                    } else {
                        return By.id("com.stockbitdev.android:id/" + locatorValue);
                    }
                case "xpath":
                    return By.xpath(locatorValue);
                case "accessibilityId":
                    return MobileBy.AccessibilityId(elementLocator);
                default:
                    throw new IllegalStateException("Unexpected value: " + locatorType);
            }
        }
    }

    public void inputText(String locator, String text) {
        driver().findElement(element(locator)).sendKeys(text);
    }

    public void tap(String locator) {
        driver().findElement(element(locator)).click();
    }

    public void isDisplayed(String locator) {
        driver().findElement(element(locator)).isDisplayed();
    }
}
