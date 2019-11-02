package com.dku.springstudy.vo;

public class Users {
    private String UserId;
    private String UserPassword;

    public Users() {
        UserId="Hyoung";
        UserPassword="gudwnsgur";
    }
    public void setUserId(String UserId) {
        this.UserId=UserId;
    }
    public String getUserId() {
        return UserId;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }
    public String getUserPassword() {
        return UserPassword;
    }

}
