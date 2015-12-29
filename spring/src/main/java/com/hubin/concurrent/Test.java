/*
 * 文 件 名: Test.java 版 权: Unis Cloud Information Technology Co., Ltd. Copyright
 * 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间: 2015-9-24
 * 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.concurrent;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    
    public static void main(String[] args) {
        final Test test = new Test();
        new Thread() {
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();
        new Thread() {
            public void run() {
                test.get(Thread.currentThread());
            };
        }.start();
    }
    
    public void get(Thread thread) {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start <= 1) {
            System.out.println(thread.getName() + "正在进行读操作");
        }
        System.out.println(thread.getName() + "读操作完毕");
    }
}