package Tests.WelcomeScreen;

import EVMobile.Framework.core.AppiumUtils;
import EVMobile.Framework.core.BaseTest;
import EVMobile.Framework.core.Environments;
import EVMobile.PageObjects.skywalkerios.WelcomeScreen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

public class BaseMobileTest extends BaseTest {

    public WelcomeScreen welcomeScreen;

    @Parameters({"environment", "device"})
    @BeforeMethod

    public void selectEnv(@Optional("Production") String environment, String device) throws MalformedURLException, InterruptedException {
        var driver = getDriver();
        welcomeScreen = new WelcomeScreen(driver);
        var loginLinkelement = welcomeScreen.loginlink;
        sleep(2000);
        AppiumUtils.performTouch(loginLinkelement, 4);
        if (environment.equalsIgnoreCase(Environments.MOCKS_INTERNAL)){
            welcomeScreen.mockEnvironment.click();
        } else if (environment.equalsIgnoreCase(Environments.TEST_INTERNAL)){
            welcomeScreen.testInternalEnvironmebnt.click();
        } else if (environment.equalsIgnoreCase(Environments.STAGE_INTERNAL)){
            welcomeScreen.stageInternalEnvironment.click();
        } else if (environment.equalsIgnoreCase(Environments.STAGE)){
            welcomeScreen.stageEnvironment.click();
        } else {
            welcomeScreen.cancelEnvSelector.click();
        }



    }
}
