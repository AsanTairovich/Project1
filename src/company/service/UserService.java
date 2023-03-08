package company.service;

import company.model.User;
import company.exceptions.MyException;

public interface UserService {
    void saveUser(User user);
    User findId(int id) throws MyException;
    void  deleteById(int id);
    void getAllUsers();
}
