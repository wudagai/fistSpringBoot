package com.springboot.Controller;

import com.springboot.Service.UserService;
import com.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller //组合注解
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/getLogin")
    public String getLogin(User user, Model model, HttpSession session){
        String userName=user.getUserName();
        String realName=user.getRealName();
        System.out.println(user);
        User userlogin= userService.userlogin(userName,realName);
        System.out.println(userlogin);
        if(userlogin!=null){
            session.setAttribute("userlogin",userlogin);
            model.addAttribute("message","欢迎登录");
            return "welcome";
        }else {
            return "login";
        }
    }
    @RequestMapping("/findUser")
    public ModelAndView findUser(){
       List<User> userList= userService.getUser();
        ModelAndView mav=new ModelAndView();
        mav.addObject("userList",userList);
        mav.setViewName("index");
        return mav;
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer userId){
        userService.deleteUser(userId);
        return "redirect:findUser";
    }
    @RequestMapping("/selectUserById")
    public String selectUserById(Integer userId, HttpServletRequest request){
        User user=userService.selectUserById(userId);
        request.setAttribute("user",user);
        return  "toedit";
    }
    @RequestMapping("/setUserById")
    public String setUserById(User user){
        userService.updateUserById(user);
        return "redirect:findUser";
    }
    @RequestMapping("/go")
    public String welcome(){
        return "login";
    }
}
