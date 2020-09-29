package com.lhb.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/abc")
@RestController
public class TestController {

    @GetMapping("/test")
    public String query() {
        return "1312456";
    }
}
