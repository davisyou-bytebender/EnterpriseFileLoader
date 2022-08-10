package com.aliyun.controller;

import com.aliyun.entity.User;
import com.aliyun.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @Author davis you
 * @Date 2022/8/9 8:23 PM
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 登录方法
     */
    @PostMapping("/login")
    public String login(User user, HttpSession session){
        User userData = userService.login(user);
        if(null != userData){
            session.setAttribute("user",userData);
            return "redirect:/file/showAll";
        }else {
            return "redirect:/login.html";
        }
    }
}
