package com.jwt.authapi.dtos;

public class RegisterUserDto {
    
    private String email;

    private String fullName;

    private String password;

    //settting up the getters and setters.
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
