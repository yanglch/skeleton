package org.example.skeleton.web.home.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.example.skeleton.common.dal.dao.UserDao;
import org.example.skeleton.common.dal.entity.UserDO;
import org.example.skeleton.core.service.UserService;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;


@RestController
@RequestMapping("/test")
public class TestController {

    @SofaReference
    private UserService userService;
//
    @GetMapping("/1")
    public Mono<Object> helloWord()throws Exception {
        return Mono.delay(Duration.ofSeconds(10)).thenReturn("123fversgf34g");
    }


    @GetMapping("2")
    public Object hello() throws Exception{
        test();
        return "123fversgf34g";
    }



    public Object test(){
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "retws";
    }
}