/*
 * 文 件 名: C.java 版 权: Unis Cloud Information Technology Co., Ltd. Copyright
 * 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间: 2016-3-27
 * 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.supers;

import java.lang.reflect.Field;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2016-3-27]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class C implements Cloneable {
    public Object clone() throws CloneNotSupportedException {
        Class classz = this.getClass();
        Field[] fields = classz.getFields();
        for (Object obj : fields) {
        }
        return super.clone();
    }
}
