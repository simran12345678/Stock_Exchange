package com.example.demo.dao;

import java.util.List;
import java.util.Map;
 
public interface CanvasjsChartDao {
 
	List<List<Map<Object, Object>>> getCanvasjsChartData(java.sql.Date date);
	List<List<Map<Object, Object>>> getFullCanvasjsChartData();
 
}