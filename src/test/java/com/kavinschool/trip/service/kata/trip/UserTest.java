package com.kavinschool.trip.service.kata.trip;

import com.kavinschool.trip.service.kata.user.User;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldReturnTrueWhenUsersAreFriends() throws Exception {
        User John = new User();
        User Bob = new User();
        John.addFriend(Bob);
    }
}