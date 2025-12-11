package com.example.Weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity saveData(@RequestBody Wheathers w) {

		service.saveData(w);
		return new ResponseEntity("add data" , HttpStatus.OK);
	}

	@GetMapping("wheather/{cityId}")
	public Wheathers getdata(@PathVariable int cityId) {
		return service.getData(cityId);

	}

}
