package com.dku.springstudy.VO;

import org.springframework.beans.factory.annotation.*;

public class User {
    private String UserId;
    private String UserPassword;

    public User () {
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
