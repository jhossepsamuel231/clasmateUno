package com.example.classmateUno.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.classmateUno.dao.Todo;

@Component
public class examenDaoImpl implements Todo{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> readOrderByYear() {
		String sql = "SELECT YEAR(OrderDate) AS anio, COUNT(*) as Cantidad_Orders\r\n"
				+ "FROM orders GROUP BY YEAR(OrderDate)";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> readOrderByCountry() {
		String sql = "select C.Country, COUNT(*) AS cantidad_ordenes\r\n"
				+ "FROM customers C, orders O\r\n"
				+ "WHERE C.CustomerID=O.CustomerID\r\n"
				+ "GROUP BY C.Country\r\n"
				+ "ORDER BY C.Country ASC";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public List<Map<String, Object>> readOrderByProduct() {
		String sql = "SELECT C.CategoryName, COUNT(*) AS Cantidad_Ordenes\r\n"
				+ "FROM categories C, products P \r\n"
				+ "WHERE C.CategoryID=P.CategoryID\r\n"
				+ "GROUP BY P.CategoryID\r\n"
				+ "ORDER BY C.CategoryName ASC";
		return jdbcTemplate.queryForList(sql);
	}

}
