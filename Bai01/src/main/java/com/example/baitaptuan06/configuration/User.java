package com.example.baitaptuan06.configuration;

import com.example.baitaptuan06.autowiring.Department;

public class User {
    private  String username;
    private  String password;
    private  Group group;
    private int id;


    public User(String username, String password, Group group, int id) {
        this.username = username;
        this.password = password;
        this.group = group;
        this.id = id;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", group=" + group +
                '}';
    }
}
