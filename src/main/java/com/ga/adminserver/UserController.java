package com.ga.adminserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    String dummy="test";
    String dummy2="test";
    String dummy3="test";

    @GetMapping("test")
    public String testApi(){
        String data = "Welcome to Admin server";
        return data;
    }

}
