package org.example.skeleton.web.home.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {


    @GetMapping("/helloWord")
    public Object helloWord() {
        return "Hello Word!!";
    }

}