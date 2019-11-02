package com.dku.springstudy.service;
import com.dku.springstudy.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginService
{
    public boolean isLoginSucceed (User user, String inputId, String inputPwd) {
        if (  user.getUser_Id().equals(inputId)  &&
                user.getUser_Pwd().equals(inputPwd)  )
            return true;
        else
            return false;
    }
}