package com.ga.adminclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    String dummy="test";
    String dummy2="test";
    String dummy3="test";

    @GetMapping("test")
    public String testApi(){
        String data = "Welcome to Admin client";
        logger.info("Log info");
        logger.debug("Log debug");
        logger.error("Log error");
        logger.trace("A TRACE Message");
        return data;
    }

}
