package Week7.RentACar.view;

import Week7.RentACar.business.UserManager;
import Week7.RentACar.core.Helper;
import Week7.RentACar.entity.User;

import javax.swing.*;

public class Loginview extends Layout {
    private JPanel container;
    private JPanel w_top;
    private JLabel lbl_welcome;
    private JLabel lbl_welcome2;
    private JPanel w_bottom;
    private JLabel lbl_username;
    private JTextField fld_username;
    private JPasswordField fld_pass;
    private JButton btn_login;
    private JLabel lbl_pass;
    private final UserManager userManager;

    public Loginview() {
        this.userManager = new UserManager();
        this.add(container);
        this.guiInitilaze(400,400);
        btn_login.addActionListener(e -> {
            JTextField[] checkFieldList = {this.fld_username, this.fld_pass};
            if (Helper.isFieldListEmpty(checkFieldList)) {
                Helper.showMsg("fill");
            } else {
                User loginUser = this.userManager.findByLogin(this.fld_username.getText(), this.fld_pass.getText());
                if (loginUser == null) {
                    Helper.showMsg("User not found");
                } else {
                    AdminView adminView = new AdminView(loginUser);
                    dispose();
                }
            }
        });
    }
}
