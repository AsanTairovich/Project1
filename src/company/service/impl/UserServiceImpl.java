package company.service.impl;

import company.dao.UserDao;
import company.exceptions.MyException;
import company.model.User;
import company.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    public UserDao getUserDao() {
        return userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.getUser().add(user);
        System.out.println(user);
    }

    @Override
    public User findId(int id) {
        User user = userDao.getUser().stream().filter(f -> f.getId() == id)
                .findFirst().orElseThrow(() -> new MyException("Андай ID жок -> " + id));
        return user;
    }

    @Override
    public void deleteById(int id) {

        User user = userDao.getUser().stream().filter(s -> s.getId() == id)
                .findFirst().orElseThrow(() -> new MyException("Андай ID жок -> " + id));
        System.out.println("Delete -> " + user);
        userDao.getUser().remove(user);
    }

    @Override
    public void getAllUsers() {
        for (User user1 : userDao.getUser()) {
            System.out.println(user1);
        }
    }
}
