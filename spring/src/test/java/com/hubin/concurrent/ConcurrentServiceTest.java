/*
 * 文 件 名: ConcurrentServiceTest.java 版 权: Unis Cloud Information Technology Co.,
 * Ltd. Copyright 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2016-1-4 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.concurrent;

import org.junit.Ignore;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2016-1-4]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ConcurrentServiceTest {
    ConcurrentService cs = ConcurrentService.getInstance();
    
    @Ignore
    public void test() {
        cs.synchronizedTest();
    }
}
