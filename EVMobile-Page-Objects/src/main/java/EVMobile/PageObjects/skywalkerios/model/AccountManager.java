package EVMobile.PageObjects.skywalkerios.model;

public class AccountManager {

    public User getPremiumUser() {
        User user = new User();
        user.setEmail("salestestteam@eagleview.com");
        user.setPassword("eagleview");

        Account premium = Account.getPremiumAccount();
        user.setAccount(premium);

        return user;
    }
}
