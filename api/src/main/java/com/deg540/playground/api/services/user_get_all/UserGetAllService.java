package com.deg540.playground.api.services.user_get_all;

import com.deg540.playground.api.services.AppService;
import com.deg540.playground.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserGetAllService implements AppService {

    @Autowired
    UserRepository userRepository;

    public AllUserResponse execute() {
        return new AllUserResponse(userRepository.findAll());
    }
}
