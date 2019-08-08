package com.example.keycloak.jsexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    @GetMapping(path = "/getnumber")
    @ResponseBody
    public String getPassword() {
        return "123456";
    }
}
