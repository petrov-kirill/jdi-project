package com.epam.jdiproject.entities;


import com.epam.commons.DataClass;

public class User extends DataClass {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
