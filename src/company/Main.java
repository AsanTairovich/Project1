package company;

import company.Gender;
import company.exceptions.MyException;
import company.model.User;
import company.service.impl.UserServiceImpl;

public class Main {
    public static <user1> void main(String[] args) {
        User user2 = new User(1, "Asan", 23, Gender.MALE);
        User user1 = new User(3, "Uson", 23,Gender.MALE);
        User user3 = new User(2, "Bakyt", 22,Gender.MALE);
        User user4 = new User(5, "Malika", 17,Gender.FEMALE);
        User user5 = new User(4, "Nurisa", 20,Gender.FEMALE);

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.saveUser(user1);
        userServiceImpl.saveUser(user2);
        userServiceImpl.saveUser(user3);
        userServiceImpl.saveUser(user4);
        userServiceImpl.saveUser(user5);

        System.out.println("_________________________________");
        try {
            System.out.println(userServiceImpl.findId(6));
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------");
        try {
            userServiceImpl.deleteById(3);
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------");
        userServiceImpl.getAllUsers();
    }
}