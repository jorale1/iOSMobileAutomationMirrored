package EVMobile.Framework.core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest<N extends Navigator> {

    private static final String IOS_APP_PATH = System.getenv("IOS_APP_PATH");
    private static final String APPIUM_SERVER_HUB_URL = System.getenv("APPIUM_SERVER_HUB_URL");
    /**
     * This is the Appium driver used by tests to interact with running device.
     * Static because it needs to be accessed from the TestListeners.
     */
    protected static AppiumDriver driver;
    /**
     * Contains the platform where tests are running.
     */
    protected static MobilePlatform platform;

    /**
     * Contains methods to interact and navigate through the different screens.
     */
    protected N navigator;

    protected abstract N createNavigator();

    /**
     * Setup executed once before a test class start testing. It will create the
     * Appium driver instance and set to the driver attribute, so tests can use
     * to create they own page objects.
     *
     * @param platformName Platform used to run tests, can be "ios" or
     *                     "android".
     * @param hostApp      Host application configured in HostApps (for example:
     *                     EagleView). If not specified it will use EagleView.
     * @param appPath      If specified, it will use this specific path to deploy the
     *                     application in the device. If not specified, it will run the application
     *                     already installed in the device.
     * @throws Exception If an initialization error happens while configuring
     *                   Appium Driver.
     */
    @Parameters({"platform", "hostApp", "appPath"})
    @BeforeClass
    public void classSetup(String platformName, @Optional("EagleView") String hostApp, @Optional String appPath) throws Exception {
        /*
        this.platform = MobilePlatform.forName(platformName);
        HostApplication hostApplication = HOST_APP_LIST.get(platform, hostApp);

        // Create and initialize a new Driver only once.
        if (driver == null) {
            driver = createIOSDriver()
            driver = createAppiumDriver(platform, hostApplication, appPath);
            setupImplicitDriverTimeout();
        } else {
            // If closed isn't called before launch it throws Abnormal Instruments termination.
            if (platform.equals(MobilePlatform.IOS)) {
                driver.closeApp();
            }
            // If driver is there we need to re-launch the app.
            driver.launchApp();
        }

        /* This accepts automatically an unexpected alertView when the app launches.
           AutoAcceptAlerts capability cannot be used because it won't allow the alerts being tested.

        dismissAlert();
        navigator = createNavigator(hostApp);
        userPrecondition = new UserPrecondition(platform, navigator);
        environmentPrecondition = new EnvironmentPrecondition(driver, platform, navigator, userPrecondition);
        initPreconditions();

        // Make sure we are closing TestRun and Driver
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try {
                    classTearDown();
                    suiteTearDown();
                } catch (Exception e) {
                    System.out.println("Exception closing Suite " + e.getLocalizedMessage());
                }
            }
        });
        */
    }

    @Parameters("device")
    private IOSDriver createIOSDriver(@Optional("S-Iphone 6") String device) throws MalformedURLException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone X");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("app", IOS_APP_PATH);
            return new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);

        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "iPhone 6");
            cap.setCapability("platformVersion", "12.1");
            cap.setCapability("app", IOS_APP_PATH);
            return new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);

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
            return new IOSDriver(new URL(APPIUM_SERVER_HUB_URL), cap);
        }
        return null;
    }
}
