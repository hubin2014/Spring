/*
 * 文 件 名: Audience.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2015-9-10 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.spring.aop;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-9-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Audience {
    public void takeSeats() {
        System.out.println("The audience is taking their seats.");
    }
    
    public void turnOffCellPhones() {
        System.out.println("The audience is turning off their cellphones");
    }
    
    public void applaud() {
        System.out.println("CLAP CLAP CLAP");
    }
    
    public void demandRefund() {
        System.out.println("Boo! We want money back");
    }
}
