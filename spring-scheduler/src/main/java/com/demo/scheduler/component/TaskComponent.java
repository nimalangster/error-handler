package com.demo.scheduler.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskComponent {
	
	@Scheduled(fixedDelay = 2000)
	private void task() {
		
		System.out.println("This is from task scheduler");
	}

}
