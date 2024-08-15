package Week7.RentACar;

import Week7.RentACar.business.UserManager;
import Week7.RentACar.core.Helper;
import Week7.RentACar.view.AdminView;

public class App {
    public static void main(String[] args) {
        Helper Helper = null;
        Helper.setTheme();
        UserManager userManager = new UserManager();
        //Loginview loginview = new Loginview();
        AdminView adminView = new AdminView(userManager.findByLogin("admin", "admin"));
    }
}
