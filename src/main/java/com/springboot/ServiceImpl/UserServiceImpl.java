package com.springboot.ServiceImpl;

import com.springboot.Mapper.UserMapper;
import com.springboot.Service.UserService;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User userlogin(String userName, String realName) {
        return userMapper.Login(userName,realName);
    }

    @Override
    public List<User> getUser() {
        return userMapper.getUser();
    }

    @Override
    public void deleteUser(Integer userId) {
        userMapper.deleteUser(userId);
    }

    @Override
    public void updateUserById(User user) {
        userMapper.updateUserById(user);
    }

    @Override
    public User selectUserById(Integer userId) {
        return userMapper.selectUserById(userId);
    }


}
