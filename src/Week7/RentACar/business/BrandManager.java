package Week7.RentACar.business;

import Week7.RentACar.dao.BrandDao;
import Week7.RentACar.entity.Brand;

import java.util.ArrayList;

public class BrandManager {
    private  final BrandDao brandDao;

    public BrandManager() {
        this.brandDao = new BrandDao();
    }
    public ArrayList<Brand> findAll(){
        return this.brandDao.findAll();
    }
}