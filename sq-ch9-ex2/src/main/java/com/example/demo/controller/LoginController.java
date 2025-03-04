package com.example.demo.controller;


import com.example.demo.LoggedUserManageService;
import com.example.demo.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final LoggedUserManageService loggedUserManageService;

    public LoginController(LoggedUserManageService loggedUserManageService) {
        this.loggedUserManageService = loggedUserManageService;
    }

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username,
                            @RequestParam String password,
                            Model model){
        boolean loggedIn = false;

        LoginProcessor loginProcessor = new LoginProcessor(loggedUserManageService);
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        loggedIn = loginProcessor.login();


        if(loggedIn){
            return "redirect:/main";
        }

        model.addAttribute("message", "로그인 실패");

        return "login.html";
    }






}
