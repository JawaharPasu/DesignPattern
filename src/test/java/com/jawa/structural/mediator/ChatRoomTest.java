package com.jawa.structural.mediator;

import org.junit.jupiter.api.Test;

public class ChatRoomTest {
    @Test
    void test() {
        ChatRoom room = new ChatRoom();
        Person john = new Person("John");
        Person jade = new Person("Jade");
        room.join(john);
        room.join(jade);

        john.privateMessage("Jade", "How are you");
        Person mark= new Person("Mark");
        room.join(mark);
        mark.say("Hello everyone!!!");

    }
}
