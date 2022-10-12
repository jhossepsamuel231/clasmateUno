package com.example.classmateUno.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.classmateUno.service.examenService;

@RestController
@CrossOrigin({"*"})
public class controller {

	
	@Autowired
	private examenService service;
	
	@GetMapping("/readOrderByYear")
	private List<Map<String, Object>> readOrderByYear(){
		return service.readOrderByYear();
	}
	
	@GetMapping("/readOrderByCountry")
	private List<Map<String, Object>> readOrderByCountry(){
		return service.readOrderByCountry();
	}
	
	@GetMapping("/readOrderByProduct")
	private List<Map<String, Object>> readOrderByProduct(){
		return service.readOrderByProduct();
	}
}
