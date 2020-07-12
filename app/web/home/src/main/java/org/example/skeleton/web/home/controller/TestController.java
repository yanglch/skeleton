package org.example.skeleton.web.home.controller;


import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.example.skeleton.common.dal.Test;
import org.example.skeleton.common.dal.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {


    @SofaReference
    private Test test;

    @GetMapping("/helloWord")
    public Object helloWord() {
        return test.list();
    }


    public static void main(String[] args) {

    }
}