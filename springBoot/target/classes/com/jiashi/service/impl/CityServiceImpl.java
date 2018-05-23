package com.jiashi.service.impl;

import com.jiashi.dao.CityDao;
import com.jiashi.domain.City;
import com.jiashi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @Transactional
    public City findCityByName(String cityName) {
    	return cityDao.findByName(cityName);
    }

}
