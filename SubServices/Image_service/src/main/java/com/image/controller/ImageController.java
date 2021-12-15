package com.image.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @RequestMapping("/")
    public void imageRoot() {
        System.out.println("this is test");
    }
    @GetMapping("/testGet")
    public void imageGet() {
        System.out.println("Test get mapping API of image service");
    }

}
