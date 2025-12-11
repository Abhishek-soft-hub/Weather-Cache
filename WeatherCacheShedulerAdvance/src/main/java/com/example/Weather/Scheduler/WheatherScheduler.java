package com.example.Weather.Scheduler;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.Weather.Cache.WheatherCache;

@Component
@EnableScheduling
public class WheatherScheduler {
	@Autowired
	WheatherCache cache;

	@Scheduled(fixedDelay = 20, initialDelay = 20, timeUnit = TimeUnit.SECONDS)
	public void clearData() {
		cache.clear();
		cache.getDataFromDB(); // call getDataFromDB 
	}

}
