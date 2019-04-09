package EVMobile.Framework.core;


import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseTest {

    private IOSDriver driver;
    // TODO: replace this variable by environment variable
    private static final String IOS_BASE_PATH= "/Users/jacosta/develop/ios-deployed-app/EagleView.app";

    @Parameters("device")
    @BeforeMethod

    public void setUp(@Optional("S-Iphone 6") String device) throws MalformedURLException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone X");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("app", IOS_BASE_PATH);
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone 6");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("app", IOS_BASE_PATH);
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

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
            cap.setCapability("app", IOS_BASE_PATH);
            driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }
    }

    @AfterMethod
    public void aftertest() {
        driver.quit();
    }

    public IOSDriver getDriver() {
        return driver;
    }
}
