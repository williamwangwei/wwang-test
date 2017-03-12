package com.wwang.test.quartz;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobKey;

public class TestJob implements Job{

	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒"); 
    Date d = new Date();  
    String returnstr = dateFormat.format(d);    
  
    public void execute(JobExecutionContext context) throws JobExecutionException {  
    	
    	System.out.println( Thread.currentThread().getName()+"---开始" );
    	 //通过上下文获取  
        JobKey jobKey = context.getJobDetail().getKey();  
          
        try {
        	System.out.println( Thread.currentThread().getName()+"---停5秒" );
			Thread.sleep( 5000 );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(jobKey + "在" + dateFormat.format(new Date()) + "时，输出了：Hello World!!!");
        
        System.out.println( Thread.currentThread().getName()+"---结束" );
        
    }  
    
}
