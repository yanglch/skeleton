package org.example.skeleton.common.dal;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.example.skeleton.common.dal.dao.UserDODynamicSqlSupport;
import org.example.skeleton.common.dal.dao.UserDao;
import org.example.skeleton.common.dal.entity.UserDO;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SofaService
public class Test {
//
    @Autowired
    private UserDao userDao;
//
    public List<UserDO> list() {
        return userDao.selectMany(SqlBuilder
                .select(UserDODynamicSqlSupport.name)
                .from(UserDODynamicSqlSupport.userDO)
                .build()
                .render(RenderingStrategies.MYBATIS3));
    }
}
