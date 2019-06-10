package com.kenny.highlight_spring4.ch3.taskscheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("every 5 seconds execute:" + dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 28 11 ? * *")
	public void fixTimeExecution() {
		System.out.println("special time:" + dateFormat.format(new Date()) + " execute");
	}
}
