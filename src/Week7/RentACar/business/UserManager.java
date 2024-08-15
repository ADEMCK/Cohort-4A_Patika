package Week7.RentACar.business;

import Week7.RentACar.dao.UserDao;
import Week7.RentACar.entity.User;

public class UserManager {
    private  final UserDao userDao;

    public UserManager() {
        this.userDao = new UserDao();
    }
    public User findByLogin(String username, String password){
        return this.userDao.findByLogin(username,password);

    }
}
