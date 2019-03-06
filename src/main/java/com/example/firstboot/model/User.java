package com.example.firstboot.model;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String hash;

    private Date regtime;

    public User(Integer id, String username, String password, String hash, Date regtime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hash = hash;
        this.regtime = regtime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }
}