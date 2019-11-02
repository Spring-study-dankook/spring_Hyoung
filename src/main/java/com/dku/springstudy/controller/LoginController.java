package com.dku.springstudy.controller;
        import com.dku.springstudy.vo.Users;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController
{
    Users testUser = new Users();

    @GetMapping("/user")
    public String user(Model model)
    {
        model.addAttribute("id", testUser.getUserId());
        model.addAttribute("pwd", testUser.getUserPassword());
        return "checkUser";
    }

    @PostMapping("/login")
    public String Login (Model model,
                         @RequestParam(value = "inputId" , required=false) String inputId ,
                         @RequestParam(value = "inputPwd" , required=false) String inputPwd )
    {
        model.addAttribute("id", inputId);
        model.addAttribute("pwd", inputPwd);

        if (  testUser.getUserId().equals(inputId)  &&
                testUser.getUserPassword().equals(inputPwd)  )
            return "correctID";
        else
            return "wrongID";
    }
}


