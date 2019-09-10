package com.deg540.playground.domain.user;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
}
