package com.deg540.playground.data.user;

import com.deg540.playground.domain.user.User;
import com.deg540.playground.domain.user.UserRepository;

import java.util.Arrays;
import java.util.List;

public class InMemoryUserRepository implements UserRepository {

    @Override
    public List<User> findAll() {
        return Arrays.asList(
                new User(0, "Name0", "Surname0"),
                new User(1, "Name1", "Surname1"),
                new User(2, "Name2", "Surname2"),
                new User(3, "Name3", "Surname3")
        );
    }
}
