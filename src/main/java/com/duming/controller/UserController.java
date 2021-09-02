package com.duming.controller;

import com.duming.pojo.User;
import com.duming.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
        @Qualifier("userServiceImpl")
    UserService userService;

    @RequestMapping("/getUserList")
    public String list(Model model){
        List<User> userList = userService.getUserList();
        model.addAttribute("list",userList);
        return "user";
    }


}
