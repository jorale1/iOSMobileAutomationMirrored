package tests;

import EVMobile.Framework.core.BaseTest;
import EVMobile.PageObjects.skywalkerios.navigator.BaseNavigator;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;

public class BaseMobileTest extends BaseTest {

    @AfterMethod
    public void afterTest() {
        driver.resetApp();
        driver.quit();
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    @Override
    protected BaseNavigator createNavigator() {
        return new BaseNavigator(driver, platform);
    }
}
