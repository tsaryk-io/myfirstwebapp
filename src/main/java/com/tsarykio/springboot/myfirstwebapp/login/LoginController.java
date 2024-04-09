package com.tsarykio.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login-jsp", method = RequestMethod.GET)
    public String loginJsp(){
        return "login";
    }

    @RequestMapping(value="login-jsp", method = RequestMethod.POST)
    public String welcomeJsp(@RequestParam String name, @RequestParam String password, ModelMap model){

        if (authenticationService.authenticate(name, password)){

        model.put("name", name);
        model.put("password", password);
        return "welcome";
        } else {
            model.put("errorMessage", "Invalid Credentials! Plase try again.");
        return "login";
        }
    }
}
