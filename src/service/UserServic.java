/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
import repository.UserRepository;

/**
 *
 * @author Admin
 */
public class UserServic {

    UserRepository userRepository;

    public UserServic() {
        userRepository = new UserRepository();
    }

    public List<User> login(String tk, String mk) {
        try {
            return userRepository.login(tk, mk);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void insert(User user) {
        this.userRepository.insert(user);
    }

    public List<User> getAll() {
        try {
            return userRepository.getAll();
        } catch (Exception ex) {
            return null;
        }
    }

//    public List<User> getList() {
//        return userRepository.getList();
//    }
}
