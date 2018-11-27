package cn.tomxin.jiandan_house.controller;

import cn.tomxin.jiandan_house.entity.QQInfo;
import cn.tomxin.jiandan_house.entity.Record;
import cn.tomxin.jiandan_house.entity.User;
import cn.tomxin.jiandan_house.service.RecordService;
import cn.tomxin.jiandan_house.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 记录控制器
 * @author: tomxin
 * @date: 2018/11/27 15:18
 * @Version 1.0
 **/

@RestController
@RequestMapping(value = "/v0.1/record")
public class RecordController {

    @Autowired
    private RecordService recordService;

    /**
     * 添加记录
     * @param
     * @return
     */
    @PostMapping
    public Record save(@RequestBody Record record){

        return recordService.save(record);
    }

    @PatchMapping
    private Record update(@RequestBody Record record) throws Exception {
        return recordService.update(record);
    }
}
