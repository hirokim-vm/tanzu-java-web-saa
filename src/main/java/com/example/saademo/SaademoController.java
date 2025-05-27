package com.example.saademo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SaademoController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot + Tanzu! Version1";
    }

}
