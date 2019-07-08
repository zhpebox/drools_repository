package com.peng.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/7/8
 */
public class schedule {

    public static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void operateSchedule(){
        Date da = null;
        Date de = null;
        try {
           da = sf.parse("2019-07-08 17:49:10");
           de = sf.parse("2019-07-08 17:49:20");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // fristly, create the factory of Schdule
        SchedulerFactory sf = new StdSchedulerFactory();
        //
        try {
            // get the instance of schedule form factory
            Scheduler scheduler = sf.getScheduler();
            // start the schedule
            scheduler.start();

            // create the detail JobDetail
            JobDetail jobDetail = JobBuilder.newJob(ExecuteJob.class)
                    .withDescription("数据库的定时操作")
                    .withIdentity("jobName","group1")
                    .usingJobData("name",1)
                    .build();
            JobDetail jobDetail1 = JobBuilder.newJob(ExecuteJob.class)
                    .withDescription("数据库的定时操作")
                    .withIdentity("jobName","group")
                    .usingJobData("name",2)
                    .build();

            //  create Trigger
            Trigger trigger = (Trigger) TriggerBuilder.newTrigger()
                    .startAt(da)
                    .withSchedule(
                            SimpleScheduleBuilder.simpleSchedule()
                                    .withRepeatCount(0))
                    .build();
            Trigger trigger1 = (Trigger) TriggerBuilder.newTrigger()
                    .startAt(de)
                    .withSchedule(
                            SimpleScheduleBuilder.simpleSchedule()
                                    .withRepeatCount(0))
                    .build();

            scheduler.scheduleJob(jobDetail,trigger);
            scheduler.scheduleJob(jobDetail1,trigger1);

//            TimeUnit.SECONDS.sleep(5);
//
//            scheduler.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        operateSchedule();
    }
}
