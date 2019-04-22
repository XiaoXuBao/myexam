package com.xxff.service.base;

import com.xxff.bean.base.UserBean;
import java.util.List;

public interface UserService {

    /**
     * 获取用户列表
     * @return
     */
    List<UserBean> getUserList();

    /**
     * 插入用户
     * @param user
     * @return
     */
    Boolean addUser(UserBean user);
}
