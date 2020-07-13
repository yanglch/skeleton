package org.example.skeleton.common.dal;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.example.skeleton.common.dal.dao.UserDODynamicSqlSupport;
import org.example.skeleton.common.dal.dao.UserDao;
import org.example.skeleton.common.dal.entity.UserDO;
import org.mybatis.dynamic.sql.SortSpecification;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
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
        return userDao.select(SelectDSLCompleter.allRowsOrderedBy(UserDODynamicSqlSupport.name));
    }
}
