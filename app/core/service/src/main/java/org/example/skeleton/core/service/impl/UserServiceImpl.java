package org.example.skeleton.core.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.example.skeleton.common.dal.dao.UserDODynamicSqlSupport;
import org.example.skeleton.common.dal.dao.UserDao;
import org.example.skeleton.common.util.CommonConvert;
import org.example.skeleton.core.model.convert.UserConvert;
import org.example.skeleton.core.model.entity.User;
import org.example.skeleton.core.service.UserService;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.where.condition.IsLike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@SofaService
public class UserServiceImpl implements UserService {

    @SofaReference
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
//        UserConvert.toUserList(userDao.select(SelectDSLCompleter.allRows()));
        return Collections.emptyList();
    }

    @Override
    public User getUserByLoginName(String loginName) {
        return CommonConvert.convert(
                userDao.selectOne(c -> c.where(UserDODynamicSqlSupport.loginName, IsLike.of(() -> loginName))).orElse(null),
                User::new);
    }


}
