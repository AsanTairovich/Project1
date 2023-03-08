package company.dao;

import company.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private List<User> user5 = new ArrayList<>();

    public UserDao() {
    }

    public UserDao(List<User> user) {
        this.user5 = user;
    }

    public List<User> getUser() {
        return user5;
    }

    public void setUser(List<User> user) {
        this.user5 = user;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "user=" + user5 +
                '}';
    }
}
