package com.vir.dao;

import java.util.List;

import com.vir.model.BusService;

public interface BusServiceDao {
	List<BusService> searchService(String serviceFrom,String serviceTo,String departureTime);

	
	
}
