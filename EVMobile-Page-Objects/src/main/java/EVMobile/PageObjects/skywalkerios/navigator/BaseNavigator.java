package EVMobile.PageObjects.skywalkerios.navigator;

import EVMobile.Framework.core.Navigator;
import EVMobile.Framework.core.Screen;
import EVMobile.PageObjects.skywalkerios.pages.SettingsScreen;
import EVMobile.PageObjects.skywalkerios.pages.login.LoginScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobilePlatform;

public class BaseNavigator extends Navigator {

    public BaseNavigator(AppiumDriver driver, MobilePlatform platform) {
        super(driver, platform);
    }

    @Override
    public Screen goToDashBoardScreen() {
        return null;
    }

    @Override
    public LoginScreen goToLoginScreen() {
        return null;
    }

    @Override
    public SettingsScreen goToSettingsScreen() {
        return null;
    }

    @Override
    public Screen goBack() {
        return null;
    }

    /*
    public TermsOfUseScreen navigateToTermsofUsescreen() {
        termsLink.click();
        return new TermsOfUseScreen(driver);
    }

    public PrivacyPolicyScreen navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicyScreen(driver);
    }

    public SignUpFlowPasswordScreen navigateToSignUpPasswordScreen() {
        page2next.click();
        return new SignUpFlowPasswordScreen(driver);
    }
    public ResetPasswordScreen clickOnDismissButton() {
        dismiss.click();
        return new EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen(driver);
    }

    public ExternalMessageScreen navigateToExternalMessageScreen() {
        contactPhone.click();
        return new ExternalMessageScreen(driver);
    }


    public EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen navigateBackToResetPassword() {
        clickOnDismissButton();
        return new EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen(driver);
    }

    public TermsOfUseScreen navigateToTermsofUseScreen() {
        confirmationTermsOfUseLink.click();
        return new TermsOfUseScreen(driver);
    }

    public PrivacyPolicyScreen navigateToPrivacyPolicyScreen() {
        confirmationPrivacyPolicyLink.click();
        return new PrivacyPolicyScreen(driver);
    }

    public WelcomeScreen clickOnDismissButton() {
        dismiss.click();
        return new WelcomeScreen(driver);
    }

    public EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordConfirmationScreen navigateToResetPasswordConfirmationScreen() {
        enterEmail(email);
        done.click();
        submitButton.click();
        return new EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordConfirmationScreen(driver);
    }

    public TermsOfUseScreen navigateToTermsofUseScreen() {
        termsOfUseLink.click();
        return new TermsOfUseScreen(driver);
    }

    public PrivacyPolicyScreen navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicyScreen(driver);
    }

    public SettingsScreen navigateToStartTesting() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        loginscreen.enterCredentials(userNoQuoteSetup, userNoQuoteSetupPassword);
        loginscreen.loginDone.click();
        loginscreen.login.click();
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        sleep(2000);
        dashBoardScreen.settingsButton.click();
        return new SettingsScreen(driver);
    }

    public void swapToLogOutLink(String device) {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 743)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 232)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.press(PointOption.point(181, 546)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(181, 208)).release().perform();
        }
    }

    public QuoteSetupFlowQuoteSettingsScreen navigateToQuoteSetpFlowScreenQuoteSettings() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        loginscreen.enterCredentials(userWithQuoteSetup, userWithQuoteSetupPassword);
        loginscreen.loginDone.click();
        loginscreen.login.click();
        DashBoardScreen dashBoardScreen = new DashBoardScreen(driver);
        sleep(2000);
        SettingsScreen settingsScreen = dashBoardScreen.navigatetoSettingsScreen();
        sleep(2000);
        quoteSettingsLink.click();
        return new QuoteSetupFlowQuoteSettingsScreen(driver);
    }

    public ExploreProductsScreen navigateToExploreProductsScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        exploreProductsLink.click();
        return new ExploreProductsScreen(driver);
    }

    public TermsOfUseScreen navigateToTermsofUseScreen() {
        termsOfUseLink.click();
        return new TermsOfUseScreen(driver);
    }

    public PrivacyPolicyScreen navigateToPrivacyPolicyScreen() {
        privacyPolicyLink.click();
        return new PrivacyPolicyScreen(driver);
    }

    public void sendMailToCustomerService(String device) throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        customerServiceLink.click();
        if (device.charAt(0)== 'S') {
            emailUnavailableSimulatorOK.isEnabled();
        }else {
            accountSection.isEnabled();
        }
    }

     public DashBoardScreen navigateBackToDashboardScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        dismiss.click();
        return new DashBoardScreen(driver);
    }

    public ContactInformationScreen navigateToContactInformationScreen() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        contactInformationLink.click();
        return new ContactInformationScreen(driver);
    }

    public QuoteSetupFlowScreenSetupScreen navigateToQuoteSetpFlowScreenSetup() throws AWTException, InterruptedException {
        navigateToStartTesting();
        sleep(2000);
        quoteSettingsLink.click();
        return new QuoteSetupFlowScreenSetupScreen(driver);
    }

    public WelcomeScreen logOutFromApplication() throws InterruptedException {
        logOutLink.click();
        sleep(1000);
        logOutButton.click();
        sleep(1000);
        return new WelcomeScreen(driver);
    }

     public SignUpFlowEmailScreen navigateBackToEmailScreen() throws AWTException {
        termsDone.click();
        return new SignUpFlowEmailScreen(driver);
    }

     public LoginScreen navigateToLoginScreen() {
        loginlink.click();
        return new LoginScreen(driver);
    }

    public SignUpFlowStartScreen navigateToSignUpStartScreen() {
        signuplink.click();
        return new SignUpFlowStartScreen(driver);
    }

    public void swapPage(String device) throws InterruptedException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
        }
    }

    public void swapPage2(String device) throws InterruptedException {
        if (device.equalsIgnoreCase("S-Iphone X")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
            ta.tap(new PointOption().withCoordinates(23, 693)).moveTo(new PointOption().withCoordinates(351, 691)).release().perform();
        } else if (device.equalsIgnoreCase("S-Iphone 6")) {
            TouchAction ta = new TouchAction(driver);
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
            ta.tap(new PointOption().withCoordinates(34, 570)).moveTo(new PointOption().withCoordinates(336, 567)).release().perform();
        }
    }

     public DashBoardScreen navigateToDashboard() throws AWTException {
        enterCredentials(email, password);
        loginDone.click();
        login.click();
        return new DashBoardScreen(driver, );
    }

    public WelcomeScreen navigateBacktoWelcome() throws AWTException {
        enterCredentials(email, password);
        loginDone.click();
        dismiss.click();
        return new WelcomeScreen(driver);
    }

    // TODO This Logic should me moved to the Navigator
    public EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen navigateToResetPassword() {
        forgotPassword.click();
        return new EVMobile.PageObjects.skywalkerios.pages.login.ResetPasswordScreen(driver);
    }

    ublic OrderReportFlowScreenPropertyLocationScreen navigateToStartOrderReport() throws AWTException, InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        LoginScreen loginscreen = welcomeScreen.navigateToLoginScreen();
        sleep(2000);
        DashBoardScreen dashBoardScreen = loginscreen.navigateToDashboard();
        sleep(2000);
        dashBoardScreen.navigateToOrderReportPropertyLocationScreen();
        sleep(2000);
        return new OrderReportFlowScreenPropertyLocationScreen(driver);
    }

    public DashBoardScreen navigateBackToDashboardScreen() throws AWTException, InterruptedException {
        navigateToStartOrderReport();
        sleep(2000);
        cancelButton.click();
        discardOrderButton.click();
        return new DashBoardScreen(driver);
    }

 public void allowLocationAccesModal() throws InterruptedException, AWTException {
        navigateToStartOrderReport();
        sleep(2000);
        currentLocationButton.click();
    }

    public void enterLocation(String validStreetUS, String cityUS, String validStateUS, String validZipUS) throws AWTException, InterruptedException {
        navigateToStartOrderReport();
        sleep(2000);
        streetField.sendKeys(validStreetUS);
        cityField.sendKeys(cityUS);
        selectStateFromStatePicker(validStateUS);
        zipCodeField.sendKeys(validZipUS);
    }


    // TODO The Screen is not responsible for the navigation, we should create a Navigator to do that
    public SettingsScreen navigatetoSettingsScreen() {
        settingsButton.click();
        return new SettingsScreen(driver, platform);
    }

    public OrderReportFlowScreenPropertyLocationScreen navigateToOrderReportPropertyLocationScreen() throws InterruptedException {
        sleep(2000);
        TouchAction ta = new TouchAction(driver);
        ta.tap(new PointOption().withCoordinates(170, 740)).perform();
        return new OrderReportFlowScreenPropertyLocationScreen(driver, platform);
    }

      public LoginScreen navigateToLoginScreen() throws AWTException {
        enterNames("jhon", "Doe");
        loginLink.click();
        return new LoginScreen(driver);
    }

    public SignUpFlowEmailScreen navigateToSignupEmailScreen() throws AWTException {
        keyboardDone.click();
        return new SignUpFlowEmailScreen(driver);
    }

    public WelcomeScreen navigateBackToWelcomePage() throws AWTException {
        dismissButton.click();
        return new WelcomeScreen(driver);
    }


    public SignUpFlowEmailScreen navigateBackToEmailScreen() {
        backToEmailScreen.click();
        return new SignUpFlowEmailScreen(driver);
    }

    public SignUpFlowPasswordScreen navigateToSelectIndustryScreen() {
        passwordScreenNext.click();
        return new SignUpFlowPasswordScreen(driver);
    }


    // TODO move this to Navigator
    public SignUpFlowScreenCompanyScreen navigateToStartTest() throws InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        SignUpFlowStartScreen signUpFlowScreenStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStartScreen.enterNames(firstName, lastName);
        signUpFlowScreenStartScreen.keyboardDone.click();
        SignUpFlowEmailScreen signUpFlowScreenEmail = new SignUpFlowEmailScreen(driver);
        signUpFlowScreenEmail.enterEmail(email);
        signUpFlowScreenEmail.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowScreenPassword = signUpFlowScreenEmail.navigateToSignUpPasswordScreen();
        signUpFlowScreenPassword.enterPasswordandConfirmPassword(password, confirmPassword);
        signUpFlowScreenPassword.keyboardDone.click();
        SignUpFlowIndustryScreen signUpFlowScreenIndustry = new SignUpFlowIndustryScreen(driver);
        sleep(2000);
        signUpFlowScreenIndustry.industryScreenNext.click();
        sleep(2000);
        return new SignUpFlowScreenCompanyScreen(driver);
    }

    public SignUpFlowIndustryScreen navigateBackToIndustryScreen() {
        backToIndustrycreen.click();
        return new SignUpFlowIndustryScreen(driver);
    }

      public SignUpFlowIndustryScreen navigateToIndustryScreen() throws InterruptedException {
        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);
        SignUpFlowStartScreen signUpFlowScreenStartScreen = welcomeScreen.navigateToSignUpStartScreen();
        signUpFlowScreenStartScreen.enterNames(fname, lname);
        signUpFlowScreenStartScreen.keyboardDone.click();
        SignUpFlowEmailScreen signUpFlowEmailScreen = new SignUpFlowEmailScreen(driver);
        signUpFlowEmailScreen.enterEmail(email);
        signUpFlowEmailScreen.termsCheck.click();
        SignUpFlowPasswordScreen signUpFlowPasswordScreen = signUpFlowEmailScreen.navigateToSignUpPasswordScreen();
        signUpFlowPasswordScreen.enterPasswordandConfirmPassword(password, confirmPassword);
        signUpFlowPasswordScreen.keyboardDone.click();
        sleep(2000);
        return new SignUpFlowIndustryScreen(driver);
    }

    public SignUpFlowScreenCompanyScreen navigateToCompanyScreen() {
        industryScreenNext.click();
        return new SignUpFlowScreenCompanyScreen(driver);
    }

     */
}
