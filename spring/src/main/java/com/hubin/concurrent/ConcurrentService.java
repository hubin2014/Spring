/*
 * 文 件 名: ConcurrentService.java 版 权: Unis Cloud Information Technology Co.,
 * Ltd. Copyright 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2015-9-24 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.concurrent;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-9-24]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ConcurrentService {
    private final static ConcurrentService ccs = new ConcurrentService();
    
    public static ConcurrentService getInstance() {
        return ccs;
    }
    
    public void synchronizedTest() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
