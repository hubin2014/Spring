/*
 * 文 件 名: TestJob.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2016-4-22 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.quartz;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * <一句话功能简述> <功能详细描述>
 * 
 * @author Administrator
 * @version [版本号, 2016-4-22]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@DisallowConcurrentExecution
public class TestJob implements Job {
    /**
     * @param context
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        System.out.println("哈哈哈哈。。。。。。。。");
    }
}
