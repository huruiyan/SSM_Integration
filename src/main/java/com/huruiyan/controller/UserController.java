package com.huruiyan.controller;

import com.huruiyan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("Controller 执行了");
        //调用service的方法
        userService.findAll();
        return "list";
    }
}
