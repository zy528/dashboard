package com.dashboard.dao;

import com.dashboard.domain.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 城市 DAO 接口类
 *
 *
 */
@Repository
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    City findByName(@Param("cityName") String cityName);
}