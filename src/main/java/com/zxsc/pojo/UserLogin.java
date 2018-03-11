package com.zxsc.pojo;

import java.util.Arrays;

public class UserLogin {
    private String username;
    private String password;

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

    @Override
    public String toString() {
        char[] hiddenPass = new char[password.length()];
        Arrays.fill(hiddenPass, '*');
        return "name: " + username + " pass: "+new String(hiddenPass);
    }
}
