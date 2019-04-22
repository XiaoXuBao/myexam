package com.xxff.dao.base;

import com.xxff.bean.base.UserBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

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
    Integer addUser(UserBean user);
}
