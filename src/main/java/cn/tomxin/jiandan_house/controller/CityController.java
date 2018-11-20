package cn.tomxin.jiandan_house.controller;

import cn.tomxin.jiandan_house.entity.City;
import cn.tomxin.jiandan_house.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * city controller
 *
 * @author tomxin
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/v0.1/city")
public class CityController {


    @Autowired
    private CityService cityService;

    /**
     * 查询全部城市
     * @return
     */
    @GetMapping(value = "/list")
    public List<City> list(){

        return cityService.list();
    }

    /**
     * 添加城市
     * @param city 城市信息
     * @return
     */
    @PostMapping
    public City add(@RequestBody City city){

        return cityService.save(city);
    }

    /**
     * 删除城市
     * @param id
     */
    @DeleteMapping(value = "/{id}")
    public City delete(@PathVariable("id") Integer id){
        return cityService.delete(id);
    }
}
