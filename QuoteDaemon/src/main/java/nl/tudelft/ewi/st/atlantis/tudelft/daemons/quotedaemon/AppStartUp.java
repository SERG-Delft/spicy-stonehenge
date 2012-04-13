package nl.tudelft.ewi.st.atlantis.tudelft.daemons.quotedaemon;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class AppStartUp implements ServletContextListener {
	
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			
			scheduler.shutdown();
			
			scheduler = null;
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

	public void contextInitialized(ServletContextEvent ctx) {
		
		try {
			Connection c = DriverManager.getConnection("jdbc:derby://localhost:1527/stonehenge");

			scheduler = StdSchedulerFactory.getDefaultScheduler();
			
			scheduler.start();
			
			String[] files = new String[]{"NASDAQ-part1.txt","NASDAQ-part2.txt",
										  "NASDAQ-part3.txt","NASDAQ-part4.txt",
										  "NASDAQ-part5.txt","NASDAQ-part6.txt"};
			
			// 2 minutes from now
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.MINUTE, 2);
			
	        for(String file : files) {
	        	// Trigger the job to run now, and then repeat every 40 seconds
		        Trigger trigger = TriggerBuilder.newTrigger()
		            							.withIdentity("trig"+file, "triggrp:"+file)
		            							.startAt(cal.getTime())
		            							.withSchedule(SimpleScheduleBuilder
		            									.simpleSchedule()
		            									.withIntervalInMinutes(5)
		            									.repeatForever())            
		            							.build();
		        
		        /* Get the inputstream from the context */
		        InputStream i = ctx.getServletContext()
		        				   .getResourceAsStream("/WEB-INF/classes/META-INF/"+file);
		        
		        /* Put it in a datamap to pass it to the job */
		        JobDataMap map = new JobDataMap();
		        map.put("filestream", i);
		        map.put("connection", c);
		        
	        	// define the job and tie it to our UpdaterJob class
		        JobDetail job = JobBuilder.newJob(UpdaterJob.class)
		            					  .withIdentity("job:"+file, "jobgrp:"+file)
		            					  .usingJobData(map)
		            					  .build();
		        
		        
		        
		        // Tell quartz to schedule the job using our trigger
		        scheduler.scheduleJob(job, trigger);
	        }
			
		} catch (SchedulerException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

	private static Scheduler scheduler = null;
}
