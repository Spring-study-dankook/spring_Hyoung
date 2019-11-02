package com.dku.springstudy.controller;
        import com.dku.springstudy.vo.User;
        import org.springframework.stereotype.Controller;
        import com.dku.springstudy.service.LoginService;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController
{
    @GetMapping("/user")
    public String user(Model model, User user)
    {
        model.addAttribute("id", user.getUser_Id());
        model.addAttribute("pwd", user.getUser_Pwd());
        return "UserView";
    }

    @PostMapping("/login")
    public String Login (Model model, User user, LoginService loginService,
                         @RequestParam(value = "inputId" , required=false) String inputId ,
                         @RequestParam(value = "inputPwd" , required=false) String inputPwd )
    {
        model.addAttribute("id", inputId);
        model.addAttribute("pwd", inputPwd);

        if( loginService.isLoginSucceed(user, inputId, inputPwd) )
            return "LoginSucceededView";
        else
            return "LoginFailedView";
    }
}


