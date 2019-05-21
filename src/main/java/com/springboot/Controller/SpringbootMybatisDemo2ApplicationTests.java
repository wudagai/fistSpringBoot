package com.springboot.Controller;


import com.springboot.Mapper.UserMapper;
import com.springboot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisDemo2ApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        /*User user=userMapper.Login("wudagai","吴大盖");
        List<User> user1=userMapper.getUser();
        System.out.println(user);
        System.out.println(user1);*/
        User user=new User();
       user.setUserName("zhangsan");
        user.setUserPhone("123");
       userMapper.addUser(user);
    }
}