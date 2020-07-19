package org.example.skeleton.core.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.example.skeleton.common.dal.dao.UserDao;
import org.example.skeleton.core.model.convert.UserConvert;
import org.example.skeleton.core.model.entity.User;
import org.example.skeleton.core.service.UserService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SofaService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return UserConvert.toUserList(userDao.select(SelectDSLCompleter.allRows()));
    }

    @Override
    public User getUserByLonginName(String loginName) {
        return null;
    }
}
