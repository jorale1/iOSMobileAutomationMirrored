package EVMobile.Framework.core;


import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    private IOSDriver driver;
    private static final String IOS_APP_PATH =  System.getenv("IOS_APP_PATH");
    private static final String APPIUM_SERVER_HUB_URL = System.getenv("APPIUM_SERVER_HUB_URL");


    @Parameters("device")
    @BeforeMethod

    public void setUp(@Optional("S-Iphone 6") String device) throws MalformedURLException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone X");
            cap.setCapability("platformVersion", "12.2");
            cap.setCapability("app", IOS_APP_PATH);
            driver = new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);

        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone 6");
            cap.setCapability("platformVersion", "12.2");
            cap.setCapability("app", IOS_APP_PATH);
            driver = new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);

        } else if (device.equalsIgnoreCase("R-Iphone 8 Plus")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("xcodeOrgId", "MD38BT333F");
            cap.setCapability("updatedWDABundleId", "io.appium.WebDriverAgentRunner");
            cap.setCapability("xcodeSigningId", "iPhone Developer");
            cap.setCapability("udid", "d35089782fd90021b1466b0c46f3692e55d035f2");
            cap.setCapability("deviceName", "Jorge’s iPhone");
            cap.setCapability("platformName", "iOS");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("startIWDP", true);
            cap.setCapability("app", IOS_APP_PATH);
            driver = new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);
        }
    }

    @AfterMethod(alwaysRun = true)
    public void aftertest() {
        driver.resetApp();
        driver.quit();
    }

    public IOSDriver getDriver() {
        return driver;
    }
}
