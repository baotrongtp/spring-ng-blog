package com.programming.techie.sptingngblog.dto;

public class RegisterRequest {

    private String username;
    private String email;
    private String password;

    public  String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
