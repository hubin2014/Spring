/*
 * 文 件 名: B.java 版 权: Unis Cloud Information Technology Co., Ltd. Copyright
 * 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间: 2015-11-10
 * 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.supers;

import java.util.Scanner;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-11-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class B extends A {
    public B(Desc desc) {
        super(desc);
    }
    
    public static final int ok = -1 << 3;
    
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        System.out.println(Integer.toBinaryString(i));
        i = i << 3;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
    }
}
