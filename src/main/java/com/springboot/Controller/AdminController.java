package com.springboot.Controller;

import com.springboot.Service.AdminService;
import com.springboot.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("findAdmin")
    public String findAdmin(Model model){
        List<Admin> admins=adminService.selectall();
        model.addAttribute("list",admins);
        return "aa";

    }
}
