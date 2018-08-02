package com.example.user.roxio.model;

public class UserInfo {

   private String name;
   private String email;
   private String phonr;
   private String passowrd;


    public UserInfo() {
    }

    public UserInfo(String name, String email, String phonr, String passowrd) {
        this.name = name;
        this.email = email;
        this.phonr = phonr;
        this.passowrd = passowrd;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonr() {
        return phonr;
    }

    public void setPhonr(String phonr) {
        this.phonr = phonr;
    }

    public String getPassowrd() {
        return passowrd;
    }

    public void setPassowrd(String passowrd) {
        this.passowrd = passowrd;
    }
}
