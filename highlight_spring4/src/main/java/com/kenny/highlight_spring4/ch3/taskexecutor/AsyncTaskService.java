package com.kenny.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("async task:" + i);
	}
	
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("async task+1:" + (i+1));
	}
}
