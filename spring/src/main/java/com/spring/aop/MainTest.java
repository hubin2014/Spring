/*
 * 文 件 名: MainTest.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2015-9-10 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-9-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class MainTest {
    /**
     * <一句话功能简述> <功能详细描述>
     * 
     * @param args [参数说明]
     * @return void [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop.xml");
        Performer performer = (Performer) ctx.getBean("kenny");
        performer.perform();
    }
    
    public void show() {
        System.out.println("211");
    }
}
