package org.example.skeleton.web.home.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.example.skeleton.core.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {


    @SofaReference
    private UserService userService;

    @GetMapping("/helloWord")
    public Object helloWord() {
        return userService.getAllUser();
    }

}