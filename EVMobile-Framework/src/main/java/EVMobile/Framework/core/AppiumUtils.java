package EVMobile.Framework.core;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AppiumUtils {
    public static IOSDriver currentWebDriver;

    public static void performTouch(WebElement element, int amountOfSeconds) {

        var driver = currentWebDriver;
        var location = element.getLocation();
        var size = element.getSize();
        TouchAction ta = new TouchAction(driver);
        var action = ta.tap(new PointOption().withCoordinates(location
                .moveBy(size.width / 2, size.height / 2)));
        if (amountOfSeconds > 0) {
            action = action.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(amountOfSeconds)));
        }
        action.release().perform();

    }

    public static void performTouch(WebElement element){
        performTouch(element, 0);
    }
}