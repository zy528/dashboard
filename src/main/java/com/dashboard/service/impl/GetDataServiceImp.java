package com.dashboard.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dashboard.dao.GetDataDao;
import com.dashboard.service.GetDataService;

@Service
public class GetDataServiceImp implements GetDataService {

	@Autowired
	GetDataDao getDataDao;
	
	
	@Override
	public List<Map<String, String>> getTestData() {
		 return (List<Map<String, String>>) getDataDao.test();
	}

}
