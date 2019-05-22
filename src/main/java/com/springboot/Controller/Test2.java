package com.springboot.Controller;

import com.springboot.Mapper.AdminMapper;
import com.springboot.entity.Admin;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test2 {
    @Autowired
    private AdminMapper adminMapper;
    @Test
    public void test2(){
       List<Admin> admins=adminMapper.findAdmin();
        System.out.println(admins);
    }
}
