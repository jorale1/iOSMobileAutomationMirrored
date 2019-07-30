package Tests.WelcomeScreen;

import EVMobile.Framework.core.BaseTest;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class BaseMobileTest extends BaseTest {

    public WelcomeScreen welcomeScreen;

    @Parameters({"environment", "device"})
    @BeforeMethod

    public void selectEnv(@Optional("Stage") String environment, String device) throws MalformedURLException, InterruptedException {
        var driver = getDriver();
        welcomeScreen = new WelcomeScreen(driver);
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        var elemento1 = welcomeScreen.loginlink;
        var action = ta.press(new PointOption().withCoordinates(elemento1.getLocation()));
        action.waitAction(WaitOptions.waitOptions(Duration.ofMillis(6000))).release().perform();
        if (environment.equalsIgnoreCase("Stage")) {
            welcomeScreen.stageEnvironment.click();

        } else if (environment.equalsIgnoreCase("Stage Internal")) {
            welcomeScreen.stageInternalEnvironment.click();
        }
    }
}
