package com.deg540.playground.api.config;

import com.deg540.playground.data.user.InMemoryUserRepository;
import com.deg540.playground.domain.user.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {
    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }
}
