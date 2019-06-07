package EVMobile.PageObjects.skywalkerios.model;

public class Account {

    public String userNoQuoteSetup = "skywalker-ios-test4@mail.com";
    public String userNoQuoteSetupPassword = "EagleView1";
    public String userWithQuoteSetup = "jorge.acosta@eagleview.com";
    public String userWithQuoteSetupPassword = "EagleView1";

    public static Account getPremiumAccount() {
        return new Account();
    }

    public static Account getConstructionAccount() {
        return new Account();
    }
}
