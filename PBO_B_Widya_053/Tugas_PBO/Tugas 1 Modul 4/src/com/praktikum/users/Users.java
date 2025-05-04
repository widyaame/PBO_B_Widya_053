package com.praktikum.users;

public abstract class Users {
    protected String username;
    protected String password;

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean login(String username, String password);
    public abstract void displayAppMenu();
}
