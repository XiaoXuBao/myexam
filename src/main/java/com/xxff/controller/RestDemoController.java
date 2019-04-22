package com.xxff.controller;

import com.xxff.bean.base.UserBean;
import com.xxff.service.base.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @RestController 相当于在所有方法上都添加了@RequestBody注解
 */
@RestController
@RequestMapping("restDemoController")
public class RestDemoController {

    @Resource
    UserService userService;

    /**
     * 获取第一页数据
     * @return
     */
    @RequestMapping(value = "getPageOneData", method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public Object getPageOneData() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        result.put("msg", "骚气的第一页数据");
        return result;
    }

    /**
     * 获取第二页数据
     * @return
     */
    @RequestMapping(value = "getPageTwoData", method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public Object getPageTwoData() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        result.put("msg", "霸气的第二页数据");
        return result;
    }

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping(value = "getUserList", method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public Object getUserList() {
        Map<String, Object> result = new HashMap<>();
        result.put("status", "ok");
        result.put("data", userService.getUserList());
        return result;
    }

    /**
     * 插入用户
     * @param name
     * @return
     */
    @RequestMapping(value = "addUser", method = RequestMethod.GET,
            produces = {"application/json;charset=UTF-8"})
    public Object addUser(String name) {
        Map<String, Object> result = new HashMap<>();
        UserBean user = new UserBean();
        user.setName(name);
        if (userService.addUser(user)) {
            result.put("status", "ok");
            result.put("msg", "插入成功");
        } else {
            result.put("status", "error");
            result.put("msg", "插入失败");
        }
        return result;
    }
}
