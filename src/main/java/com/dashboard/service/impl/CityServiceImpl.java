package com.dashboard.service.impl;


import com.dashboard.dao.CityDao;
import com.dashboard.domain.City;
import com.dashboard.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市业务逻辑实现类
 *
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;
    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

}