package org.example.skeleton.core.model.convert;

import org.example.skeleton.common.dal.entity.UserDO;
import org.example.skeleton.core.model.entity.User;
import org.example.skeleton.core.model.enums.UserStatusEnum;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public final class UserConvert {

    public static User toUser(UserDO userDO) {
        if (userDO == null) {
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        user.setStatus(UserStatusEnum.getEnumByCode(userDO.getStatus()));
        return user;
    }

    public static List<User> toUserList(List<UserDO> userDOList) {
        if (CollectionUtils.isEmpty(userDOList)) {
            return null;
        }

        List<User> userList = new ArrayList<>();
        for (UserDO userDO : userDOList) {
            userList.add(toUser(userDO));
        }
        return userList;
    }
}
