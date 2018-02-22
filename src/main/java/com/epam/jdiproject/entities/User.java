package com.epam.jdiproject.entities;

public class User {

    public static final User PITER_CHAILOVSKII = new User("Piter Chailovskii", "epam", "1234");

    private String fullName;
    private String login;
    private String password;

    public User() {
    }

    public User(String fullName, String login, String password) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
