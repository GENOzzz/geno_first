package geno.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/sign")
    public String signUp(){
        return "User/SignUp";
    }
}
