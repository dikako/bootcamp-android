package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import stockbit.test.android_driver.AndroidDriverInstance;

import static stockbit.test.utils.Constants.ELEMENTS;
import static stockbit.test.utils.Utils.loadElementProperties;

public class WebDriverHooks {

    @Before
    public void initializeAndroidDriver() {
        AndroidDriverInstance.initialize();
        loadElementProperties(ELEMENTS);
    }

    @After
    public void quitAndroidDriver() {
        AndroidDriverInstance.quit();
    }
}
