package com.springsecurity.springSecurity.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private static final Logger LOG= LoggerFactory.getLogger(AuthController.class);

    @GetMapping
    public String home(){
        return "Hello,JWT";
    }
}
