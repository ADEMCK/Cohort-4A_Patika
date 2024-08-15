package Week7.RentACar.view;

import javax.swing.*;

public class Layout extends JFrame {
    private Week7.RentACar.core.Helper Helper;

    public void guiInitilaze(int width, int height){
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Tourism Agency");
        this.setSize(400, 400);
        this.setLocation(Helper.getLocationPoint("x", this.getSize()), Helper.getLocationPoint("y", this.getSize()));
        this.setVisible(true);
    }
}
