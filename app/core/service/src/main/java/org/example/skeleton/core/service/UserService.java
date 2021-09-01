package org.example.skeleton.core.service;

import org.example.skeleton.core.model.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();


    User getUserByLoginName(String loginName);
}
