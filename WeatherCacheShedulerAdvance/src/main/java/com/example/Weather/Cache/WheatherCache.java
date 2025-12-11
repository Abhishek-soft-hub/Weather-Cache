package com.example.Weather.Cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.example.Weather.controller.WheatherController;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Weather.Entity.Wheathers;
import com.example.Weather.Repository.WheatherRepo;

@Component
public class WheatherCache {

	Map<Integer, Wheathers> map = new HashMap<>();
	@Autowired
	WheatherRepo repo;

	public void saveDataInCache(Wheathers w) {
		System.out.println("add data");
		map.put(w.getCityId(), w);

	}

	public Wheathers getDatafromCache(int cityId) {
		System.out.println("get data from cache");
		return map.get(cityId);

	}

	public boolean chekDataInCache(int cityId) {

		System.out.println("check data in cache ");
		return map.containsKey(cityId);

	}

	public void clear() {
		System.out.println("clear");
		map.clear();
	}

	@PostConstruct
	public void getDataFromDB() {
		List<Wheathers> list = repo.findAll();
		System.out.println("get data from database");
		for (Wheathers w : list) {
			map.put(w.getCityId(), w);
		}
	}

}
