package com.dashboard.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dashboard.domain.City;

@Repository
public interface GetDataDao {

	public List<Map<String, String>> test();
}
