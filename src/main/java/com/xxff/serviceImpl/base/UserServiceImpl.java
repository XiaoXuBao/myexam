package com.xxff.serviceImpl.base;

import com.xxff.bean.base.UserBean;
import com.xxff.dao.base.UserDao;
import com.xxff.service.base.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    /**
     * 获取用户列表
     * @return
     */
    public List<UserBean> getUserList() {
        return userDao.getUserList();
    }

    /**
     * 插入用户
     * @param user
     * @return
     */
    public Boolean addUser(UserBean user) {
        if (userDao.addUser(user) > 0) {
            return true;
        } else {
            return false;
        }
    }
}
