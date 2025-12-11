package com.example.Weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Weather.Entity.Wheathers;
import com.example.Weather.Service.WheatherService;

@RestController
public class WheatherController {
	@Autowired
	WheatherService service;

	@PostMapping("Wheather")
	public String saveData(@RequestBody Wheathers w) {

		service.saveData(w);
		return "add data";
	}

	@GetMapping("wheather/{cityId}")
	public Wheathers getdata(@PathVariable int cityId) {
		return service.getData(cityId);

	}

}
