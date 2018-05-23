package com.jiashi.web;

import com.jiashi.domain.City;
import com.jiashi.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "api/city", method = RequestMethod.GET)
    public String findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        City city =  cityService.findCityByName(cityName);
        return city.toString();
    }

    @RequestMapping(value = "city")
    public String findCity() {
        City city = new City();
        city.setCityName("合肥");
        city.setDescription("hefei");
        city.setId(111L);
        return city.toString();
    }

}
