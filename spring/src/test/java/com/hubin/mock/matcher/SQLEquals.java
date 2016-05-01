/*
 * 文 件 名: SQLEquals.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2016-1-8 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.mock.matcher;

import org.easymock.EasyMock;
import org.easymock.IArgumentMatcher;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2016-1-8]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class SQLEquals implements IArgumentMatcher {
    private String exceptSql = null;
    
    public SQLEquals(String exceptSql) {
        super();
        this.exceptSql = exceptSql;
    }
    
    /**
     * 实际情况和期盼的结果进行比较，一样的时候返还true否则返还false
     * 
     * @param actualSQL
     * @return
     */
    @Override
    public boolean matches(Object actualSQL) {
        if (actualSQL instanceof String) {
            return exceptSql.equals(actualSQL);
        }
        return false;
    }
    
    /**
     * 设置期盼值时调用该方法
     * 
     * @param exceptSql
     * @return [参数说明]
     * @return String [返回类型说明]
     * @exception throws [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public static String sqlMatcher(String exceptSql) {
        EasyMock.reportMatcher(new SQLEquals(exceptSql));
        return null;
    }
    
    /**
     * @param buffer
     */
    @Override
    public void appendTo(StringBuffer buffer) {
        // TODO Auto-generated method stub
    }
}
