package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManageService loggedUserManageService;

    private String username;
    private String password;


    public LoginProcessor(LoggedUserManageService loggedUserManageService){
        this.loggedUserManageService = loggedUserManageService;
    }


    public boolean login(){
        String username = this.username;
        String password = this.password;
        if("natalie".equals(username) && "password".equals(password)){
            loggedUserManageService.setUsername(username);
            return true;
        }
        else {
            return false;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
