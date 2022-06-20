package com.revature.controller;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.service.UserService;
import io.javalin.http.Handler;

public class UserController {

    UserService userService;

    public UserController() {
        userService = new UserService();
    }

    public UserController(UserService userService){
        this.userService = userService;
    }
    public Handler getAllUsers = context -> {
        context.json(userService.getAllUsers());
    };
    public Handler createUser = context -> {
        User user = context.bodyAsClass(User.class);
        userService.createUser(user);
    };



}
