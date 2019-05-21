package com.springboot.Controller;

import com.springboot.Mapper.UserMapper;
import com.springboot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test(){
    List<User> users=userMapper.getUser();
        System.out.println(users);

    }
}
