package com.deg540.playground.data.user;

import org.junit.Test;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

public class InMemoryUserRepositoryTest {
    @Test
    public void it_returns_user_list() {
        InMemoryUserRepository userRepository = new InMemoryUserRepository();

        assertThat(userRepository.findAll(), hasSize(4));
    }
}