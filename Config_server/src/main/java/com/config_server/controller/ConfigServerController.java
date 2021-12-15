package com.config_server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigServerController {
//    @Value("${test}")
//    private String testConfig;

    @GetMapping("/test")
    public String testFunc() {
//        return testConfig;
        return "Test";
    }

}
