package com.epam.jdiproject.enums;

public enum Users {
    PITER_CHAILOVSKII("PITER CHAILOVSKII", "epam", "1234");

   public String fullName;
   public String login;
   public String password;

    Users(String fullName, String login, String password) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
    }
}
