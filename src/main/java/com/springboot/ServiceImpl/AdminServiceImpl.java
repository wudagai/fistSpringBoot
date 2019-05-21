package com.springboot.ServiceImpl;

import com.springboot.Mapper.AdminMapper;
import com.springboot.Service.AdminService;
import com.springboot.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> selectall() {
        return adminMapper.findAdmin();
    }
}
