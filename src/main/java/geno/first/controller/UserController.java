package geno.first.controller;

import geno.first.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Slf4j
@Controller
public class UserController {

    @Autowired
    UserService userService;

    //회원가입 페이지
    @GetMapping("/sign")
    public String signUp(){
        return "User/SignUp";
    }

    @PostMapping("/signup/checkID")
    @ResponseBody
    public int checkID(String id){
        return userService.checkID(id);
    }
}
