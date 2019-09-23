package com.vir.service;

import java.util.List;

import com.vir.model.BusService;

public interface BusServiceService {
	List<BusService> searchService(String serviceFrom,String serviceTo,String departureTime);

}
