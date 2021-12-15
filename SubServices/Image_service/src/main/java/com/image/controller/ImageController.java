package com.image.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageController {
    @GetMapping("/testGet")
    public String imageGet() {
        return "Test get mapping API of image service";
    }

    @GetMapping("/testHome")
    public String imageHome() {
        return "Test get mapping API of image service";
    }
}
