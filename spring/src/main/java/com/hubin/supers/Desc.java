/*
 * 文 件 名: Desc.java 版 权: Unis Cloud Information Technology Co., Ltd. Copyright
 * 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间: 2015-11-10
 * 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.supers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-11-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Desc {
    public static void main(String[] args) throws Exception {
        A a = new A();
        a.setName("张三");
        a.setAge(10);
        B b = new B();
        b.setA(a);
        b.setName("南京");
        List<B> list = new ArrayList<B>();
        list.add(b);
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(byteOut);
        out.writeObject(list);
        ByteArrayInputStream byteIn = new ByteArrayInputStream(
                byteOut.toByteArray());
        ObjectInputStream in = new ObjectInputStream(byteIn);
        List<B> list1 = (List<B>) in.readObject();
        list1.get(0).getA().setName("李四");
        System.out.println(list.get(0));
        System.out.println(list1.get(0));
    }
}
