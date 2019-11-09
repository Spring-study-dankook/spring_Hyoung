package com.dku.springstudy.controller;

import com.dku.springstudy.vo.User;
import com.dku.springstudy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
public class LoginController
{
    @Autowired
    LoginService loginService;

    @GetMapping("/user")
    public String user(Model model, User user) {
        model.addAttribute("id", user.getUser_Id());
        model.addAttribute("pwd", user.getUser_Pwd());
        return "userView";
    }

    @PostMapping("/login")
    public String login(Model model, User user,
                        @RequestParam(value = "inputId", required = false) String inputId,
                        @RequestParam(value = "inputPwd", required = false) String inputPwd) {
        model.addAttribute("id", inputId);
        model.addAttribute("pwd", inputPwd);

        if (loginService.isLoginSucceed(user, inputId, inputPwd))
            return "loginView/loginSucceededView";
        else
            return "loginView/loginFailedView";
    }
}