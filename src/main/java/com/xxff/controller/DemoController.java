package com.xxff.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("demoController")
public class DemoController {

    /**
     * 跳转到第一页
     * @return
     */
    @RequestMapping(value = "toPageOne")
    public String toPageOne(Model model) {
        model.addAttribute("data", "我是model里面第一页的数据哦");
        return "demo/pageOne";
    }

    /**
     * 跳转到第二页
     * @return
     */
    @RequestMapping(value = "toPageTwo")
    public String toPageTwo(Model model) {
        model.addAttribute("data", "我是model里面第二页的数据哦");
        return "demo/pageTwo";
    }
}