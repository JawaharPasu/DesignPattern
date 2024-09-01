package com.jawa.structural.flyweight.repeatingusernames;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    void test() {
        User user1 = new User("John smith");
        User user2 = new User("Jane smith");
        assertEquals(3, User.strings.size());
        assertEquals("John smith",user1.getName());
        assertEquals("Jane smith",user2.getName());
    }
}
