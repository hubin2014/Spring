/*
 * 文 件 名: Concurrent.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2015-9-24 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hubin.concurrent.ConcurrentService;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-9-24]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Controller
public class ConcurrentController {
    ConcurrentService ccs = ConcurrentService.getInstance();
    
    @RequestMapping("concurrent")
    @ResponseBody
    public void concurrentTest1() {
        ccs.synchronizedTest();
    }
    
    @RequestMapping("view")
    @ResponseBody
    public String viewTest(HttpSession session) {
        return session.getId();
    }
    
    /*
     * 重定向，URL地址会改变
     */
    @RequestMapping("redirect")
    public String redirect() {
        return "redirect:view.htm";
    }
    
    /*
     * 转向，URL地址不会改变
     */
    @RequestMapping("forward")
    public String forword() {
        return "forward:view.htm";
    }
    
    @RequestMapping("freemark")
    public ModelAndView freemark() {
        return new ModelAndView("hi");
    }
    
    @RequestMapping("html")
    public String html() {
        return "testHtml";
    }
}
