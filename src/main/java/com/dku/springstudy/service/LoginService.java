package com.dku.springstudy.service;
import com.dku.springstudy.vo.User;

public class LoginService
{
    // 로그인 성공 여부 확인 service
    public boolean isLoginSucceed (User user, String inputId, String inputPwd) {
        if (  user.getUser_Id().equals(inputId)  &&
                user.getUser_Pwd().equals(inputPwd)  )
            return true;
        else
            return false;
    }
}