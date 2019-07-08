package com.peng.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.time.LocalDateTime;

/**
 * @Description:
 * @Auther: zhangpeng
 * @Date: 2019/7/8
 */
public class ExecuteJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(jobExecutionContext.getJobDetail().getKey().getName());
        System.out.println("Hello "+ LocalDateTime.now());
    }
}
