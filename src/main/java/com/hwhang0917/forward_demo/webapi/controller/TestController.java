package com.hwhang0917.forward_demo.webapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String getMethodName() {
        return "hello";
    }
}
