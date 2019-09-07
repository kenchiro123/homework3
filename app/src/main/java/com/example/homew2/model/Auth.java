package com.example.homew2.model;

public class Auth {
    private static final String EMAIL="ken@hotmail.com"; //**
    private static final String PASSWORD="123456"; //**

    private String mEmail;
    private String mPassword;

    public Auth(String email, String password) {
        this.mEmail = email;
        this.mPassword = password;
    }

    /*public String getmEmail() {
        return mEmail;
    }

    /public void setmEmail(String email) { this.mEmail = email; }

    public String getmPassword() { return mPassword; }

    public void setmPassword(String Password) { this.mPassword = Password;
    }*/

    public  boolean check(){
        if(mEmail.equals(EMAIL)&&mPassword.equals(PASSWORD)){
            return true;
        }
        else{
            return  false;
        }
    }

}
