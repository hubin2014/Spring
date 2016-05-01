/*
 * 文 件 名: B.java 版 权: Unis Cloud Information Technology Co., Ltd. Copyright
 * 2015, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间: 2015-11-10
 * 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.supers;

import java.io.Serializable;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2015-11-10]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class B implements Serializable {
    private A a;
    
    private String name;
    
    /**
     * @return 返回 a
     */
    public A getA() {
        return a;
    }
    
    /**
     * @param 对a进行赋值
     */
    public void setA(A a) {
        this.a = a;
    }
    
    /**
     * @return 返回 name
     */
    public String getName() {
        return name;
    }
    
    /**
     * @param 对name进行赋值
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return
     */
    @Override
    public String toString() {
        return "B [a=" + a + ", name=" + name + "]";
    }
}
