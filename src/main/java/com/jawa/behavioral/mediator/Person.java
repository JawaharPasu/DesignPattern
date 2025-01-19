package com.jawa.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public String name;
    public ChatRoom room;
    private List<String> chatLogs = new ArrayList<>();

    public Person(String name) {
        this.name= name;
    }

    public void receiveMessage(String sender, String message) {
        String log = sender + " : '" + message + "'";
        System.out.println("[" + name + "'s chat session " + log);
        chatLogs.add(log);
    }

    public void say(String message) {
        room.broadcast(name, message);
    }

    public void privateMessage(String who, String message) {
        room.message(name, who, message);
    }
}
