//package org.example.skeleton.web.home.controller.config;
//
//import com.alipay.sofa.runtime.api.annotation.SofaReference;
//import org.example.skeleton.core.service.UserService;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Component;
//import reactor.core.publisher.Mono;
//
//import java.util.Collections;
//
//
//public class DefaultReactiveUserDetailsService implements ReactiveUserDetailsService {
//
//    @SofaReference
//    private UserService userService;
//
//    @Override
//    public Mono<UserDetails> findByUsername(String loginName) {
//        return Mono.just(new User("admin", "123456", Collections.emptyList()));
//    }
//}
