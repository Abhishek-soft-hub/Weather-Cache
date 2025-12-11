package com.example.Weather.Service;

import com.example.Weather.Entity.Wheathers;

public interface WheatherService {
	
	public void saveData(Wheathers w);
	public Wheathers getData(int cityId);
}
