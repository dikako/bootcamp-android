package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stockbit.test.android_driver.AndroidDriverInstance;

public class WebDriverHooks {

    @Before
    public void initializeAndroidDriver() {
        AndroidDriverInstance.initialize();
    }

    @After
    public void quitAndroidDriver() {
        AndroidDriverInstance.quit();
    }
}
