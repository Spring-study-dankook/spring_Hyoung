package com.dku.springstudy.controller;

import com.dku.springstudy.VO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    User testUser = new User();

    @GetMapping("/user")
    public String index(Model model)
    {
        model.addAttribute("id", testUser.getUserId());
        model.addAttribute("pwd", testUser.getUserPassword());
        return "index";
    }

    @PostMapping("/login")
    public String Login (Model model,
                         @RequestParam(value = "inputId" , required=false) String inputId ,
                         @RequestParam(value = "inputPwd" , required=false) String inputPwd ) {

        model.addAttribute("id", inputId);
        model.addAttribute("pwd", inputPwd);

        if (  testUser.getUserId().equals(inputId)  &&
                testUser.getUserPassword().equals(inputPwd)  )
            return "correctID";
        else
            return "wrongID";
    }
}
