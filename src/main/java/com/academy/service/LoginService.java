package com.academy.service;

import com.academy.model.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class LoginService {
    private List<User> users = new ArrayList<>();

    public LoginService() {
        User user = new User("Pavel", "12345");
        User user1 = new User("Sergei", "12345");
        User user2 = new User("Vadim", "12345");
        users.add(user);
        users.add(user1);
        users.add(user2);
    }



    public boolean checkCredentials(String login, String password) {
        for (User user : users) {
            if ((user.getLoginUser().equals(login)) && (user.getPasswordUser().equals(password))) {
                return true;
            }
        }
        return false;
    }
}