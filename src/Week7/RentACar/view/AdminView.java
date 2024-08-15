package Week7.RentACar.view;

import Week7.RentACar.business.BrandManager;
import Week7.RentACar.entity.Brand;
import Week7.RentACar.entity.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class AdminView extends Layout {
    private JPanel container;
    private JLabel lbl_welcome;
    private JPanel pnl_top;
    private JTabbedPane tab_menu;
    private JButton btn_logout;
    private JPanel pnl_brand;
    private JScrollPane scrl_brand;
    private JTable tbl_brand;
    private User user;
    private DefaultTableModel tmdl_brand = new DefaultTableModel();
    private BrandManager brandManager;

    public AdminView(User user) {
        this.brandManager = new BrandManager();
        this.add(container);
        this.guiInitilaze(1000, 500);
        this.user = user;

        if (this.user == null) {
            dispose();
        }
        this.lbl_welcome.setText("Welcome : " + this.user.getUsername());

        Object[] col_brand = {"Brand ID", "Brand Name"};
        ArrayList<Brand> brandList = brandManager.findAll();
        tmdl_brand.setColumnIdentifiers(col_brand);
        for (Brand brand : brandList) {
            Object[] obj = {brand.getId(), brand.getName()};
            tmdl_brand.addRow(obj);
        }

        tbl_brand.setModel(tmdl_brand);
        tbl_brand.getTableHeader().setReorderingAllowed(false);
        tbl_brand.setEnabled(false);

    }
}
