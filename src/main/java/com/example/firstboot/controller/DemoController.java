package com.example.firstboot.controller;

import com.example.firstboot.mapper.UserMapper;
import com.example.firstboot.model.User;
import com.example.firstboot.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("user相关测试Api")
@RestController
@RequestMapping("/user")
public class DemoController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public User getUser(int id) {
        User user=userService.GetUser(id);
        return user;
    }

}
