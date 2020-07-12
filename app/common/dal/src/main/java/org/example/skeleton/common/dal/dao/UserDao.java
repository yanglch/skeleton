package org.example.skeleton.common.dal.dao;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import org.example.skeleton.common.dal.entity.UserDO;

import java.util.List;

public interface UserDao {

    List<UserDO> list ();

}
