package com.springboot.Service;

import com.springboot.entity.User;

import java.util.List;

public interface UserService {
    User userlogin(String userName,String realName);
    List<User> getUser();
    void deleteUser(Integer userId);
    void updateUserById(User user);
    User selectUserById(Integer userId);
}
