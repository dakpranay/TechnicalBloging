package com.example.demo.Service;

import com.example.demo.Model2.User;

public class UserService {
    public static boolean login(User user){
        if(user.getUsername().equals("validuser")){
            return true;
        }
        else{
            return false;
        }
    }
}
