package com.example.renderhello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping
    public void hello() {
        System.out.println("hello");
    }
}
