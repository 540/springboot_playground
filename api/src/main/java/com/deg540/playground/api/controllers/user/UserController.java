package com.deg540.playground.api.controllers.user;

import com.deg540.playground.api.services.user_get_all.AllUserResponse;
import com.deg540.playground.api.services.user_get_all.UserGetAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserGetAllService userGetAllService;

    @GetMapping("/user")
    public AllUserResponse allUsers() {
        return userGetAllService.execute();
    }
}