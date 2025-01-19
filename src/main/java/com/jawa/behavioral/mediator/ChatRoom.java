package com.jawa.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    public List<Person> people = new ArrayList<>();

    public void join(Person person) {
        String joinMSg = person.name + " has joined the room";
        broadcast("room", joinMSg);
        person.room = this;
        this.people.add(person);
    }

    public void broadcast(String sender, String message) {
        for (Person person: people) {
            if(!person.name.equals(sender)) person.receiveMessage(sender, message);
        }
    }

    public void message(String sender, String receiver, String message) {
        for (Person person: people) {
            if (person.name.equals(receiver)) person.receiveMessage(sender, message);
        }
    }
}
