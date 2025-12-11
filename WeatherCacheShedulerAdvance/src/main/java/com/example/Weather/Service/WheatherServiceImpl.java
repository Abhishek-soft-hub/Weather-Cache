package com.example.Weather.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Weather.Cache.WheatherCache;
import com.example.Weather.Entity.Wheathers;
import com.example.Weather.Repository.WheatherRepo;

@Service
public class WheatherServiceImpl implements WheatherService {

	@Autowired
	WheatherRepo repo;
	@Autowired
	WheatherCache cache;

	@Override
	public void saveData(Wheathers w) {
		repo.save(w);
	}

	@Override
	public Wheathers getData(int cityId) {
		if (cache.chekDataInCache(cityId)) {
			return cache.getDatafromCache(cityId);
		} else {
			Wheathers w = repo.findById(cityId).get();
			cache.saveDataInCache(w);
			return w;

		}

	}

}
