package com.dku.springstudy;

import com.dku.springstudy.VO.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
    public class ViewController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("memberId", "Hyoung");
        model.addAttribute("name", "Hyoung JoonHyuck");

        return "FreeMarker";
    }

}




