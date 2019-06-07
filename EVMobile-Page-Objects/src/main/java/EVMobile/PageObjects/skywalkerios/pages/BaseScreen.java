package EVMobile.PageObjects.skywalkerios.pages;

import EVMobile.Framework.core.Screen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobilePlatform;

public abstract class BaseScreen extends Screen {

    public MobileElement dismissButton;

    public MobileElement backButton;

    protected MobileElement loadingLabel;

    /**
     * Screen constructor.
     *
     * @param driver   Appium driver.
     * @param platform The platform to be used. Android/iOS.
     */
    public BaseScreen(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    public MobileElement getBackButtonElement() {
        return this.backButton;
    }

    @Override
    public MobileElement getLoadingElement() {
        return this.loadingLabel;
    }

    public MobileElement getBackButton() {
        return backButton;
    }

    public void hideKeyboard() {
        driver.hideKeyboard();
    }

    public boolean isKeyboardDisplayed() {
        if (driver instanceof IOSDriver) {
            return ((IOSDriver) driver).isKeyboardShown();
        } else {
            return ((AndroidDriver) driver).isKeyboardShown();
        }
    }
}
