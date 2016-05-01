/*
 * 文 件 名: QuartzTest.java 版 权: Unis Cloud Information Technology Co., Ltd.
 * Copyright 2016, All rights reserved 描 述: <描述> 修 改 人: Administrator 修改时间:
 * 2016-4-22 跟踪单号: <跟踪单号> 修改单号: <修改单号> 修改内容: <修改内容>
 */
package com.hubin.quartz;

import java.util.Properties;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class QuartzTest {
    public static void main(String args[]) throws SchedulerException {
        // 事件1
        JobDetail jobDetail = JobBuilder.newJob(TestJob.class)
                .withIdentity("testJob_1", "groupjob_1")
                .build();
        // 事件2
        JobDetail jobDetail2 = JobBuilder.newJob(TestJob2.class)
                .withIdentity("testJob_2", "groupjob_2")
                .build();
        QuartzTest qt = new QuartzTest();
        // **********************获取触发器*********************
        Trigger trigger1 = qt.triggerSimp();
        Trigger trigger2 = qt.triggerCron();
        // **************************************************
        Scheduler sched = getScheduler();
        sched.scheduleJob(jobDetail, trigger1);
        sched.scheduleJob(jobDetail2, trigger2);
        sched.start();
    }
    
    public Trigger triggerSimp() {
        ScheduleBuilder<?> scheduleBuilder1 = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(5)
                // 时间间隔
                .repeatForever();
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger", "group")
                .startNow()
                .withSchedule(scheduleBuilder1)
                .build();
        return trigger;
    }
    
    public Trigger triggerCron() {
        ScheduleBuilder<?> scheduleBuilder2 = CronScheduleBuilder.cronSchedule("*/5 * * * * ?");
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger_1", "group_1")
                .startNow()
                .withSchedule(scheduleBuilder2)
                .build();
        return trigger;
    }
    
    static Scheduler scheduler = null;
    
    public static Scheduler getScheduler() throws SchedulerException {
        if (scheduler == null) {
            StdSchedulerFactory sf = new StdSchedulerFactory(
                    "quartz.properties");
            Properties pros = new Properties();
            pros.put("org.quartz.threadPool.threadCount", "100");
            sf.initialize(pros);
            scheduler = sf.getScheduler();
        }
        return scheduler;
    }
}
