package com.dku.springstudy.controller;
        import com.dku.springstudy.vo.User;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController
{
    User testUser = new User();

    @GetMapping("/user")
    public String user(Model model)
    {
        model.addAttribute("id", testUser.getUser_Id());
        model.addAttribute("pwd", testUser.getUser_Pwd());
        return "CheckUserView";
    }

    @PostMapping("/login")
    public String Login (Model model,
                         @RequestParam(value = "inputId" , required=false) String inputId ,
                         @RequestParam(value = "inputPwd" , required=false) String inputPwd )
    {
        model.addAttribute("id", inputId);
        model.addAttribute("pwd", inputPwd);

        if (  testUser.getUser_Id().equals(inputId)  &&
                testUser.getUser_Pwd().equals(inputPwd)  )
            return "LoginView";
        else
            return "LoignView";
    }
}


