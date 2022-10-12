package com.example.classmateUno.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classmateUno.dao.Todo;
import com.example.classmateUno.daoImpl.examenDaoImpl;

@Service
public class examenService implements Todo{

	@Autowired
	private examenDaoImpl daoImpl;
	
	@Override
	public List<Map<String, Object>> readOrderByYear() {
		// TODO Auto-generated method stub
		return daoImpl.readOrderByYear();
	}

	@Override
	public List<Map<String, Object>> readOrderByCountry() {
		// TODO Auto-generated method stub
		return daoImpl.readOrderByCountry();
	}

	@Override
	public List<Map<String, Object>> readOrderByProduct() {
		// TODO Auto-generated method stub
		return daoImpl.readOrderByProduct();
	}
	
}
