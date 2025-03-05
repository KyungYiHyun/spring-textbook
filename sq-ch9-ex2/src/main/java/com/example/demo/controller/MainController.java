package com.example.demo.controller;


import com.example.demo.LoggedUserManageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final LoggedUserManageService loggedUserManageService;

    public MainController(LoggedUserManageService loggedUserManageService) {
        this.loggedUserManageService = loggedUserManageService;

    }

    @GetMapping("/main")
    public String home(@RequestParam(required = false) String logout,
                       Model model) {


        if (logout != null) {
            loggedUserManageService.setUsername(null);
        }
        String username = loggedUserManageService.getUsername();

        if (username == null) {
            return "redirect:/";
        }


        model.addAttribute("username", username);
        return "main.html";

    }


}
