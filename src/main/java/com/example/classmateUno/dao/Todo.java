package com.example.classmateUno.dao;

import java.util.List;
import java.util.Map;

public interface Todo {
	List<Map<String, Object>> readOrderByYear();
	List<Map<String, Object>> readOrderByCountry();
	List<Map<String, Object>> readOrderByProduct();
}
