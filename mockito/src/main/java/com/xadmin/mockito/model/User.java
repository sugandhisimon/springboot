package com.xadmin.mockito.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String game;
    private String age;

    public User(int id, String name, String game, String age) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public String getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

