package com.deg540.playground.api.services.user_get_all;

import com.deg540.playground.domain.user.User;

import java.util.List;

public class AllUserResponse {
    private List<User> users;

    public AllUserResponse(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }
}