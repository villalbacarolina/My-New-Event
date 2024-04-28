package com.example.mynewevent.entity;

public class User {

    @ManyToMany
    private Set<Event> events;

}
