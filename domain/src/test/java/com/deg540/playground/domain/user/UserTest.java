package com.deg540.playground.domain.user;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {
    @Test
    public void it_returns_fullname() {
        User user = new User(0, "Name", "Surname");

        assertThat(user.getFullname(), is("Name Surname"));
    }
}