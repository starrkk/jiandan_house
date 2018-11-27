package cn.tomxin.jiandan_house.service;

import cn.tomxin.jiandan_house.entity.Record;

import java.util.List;

public interface RecordService {

    List<Record> findAllByOpenId(String openId);

    Record save(Record record);

    Record update(Record record) throws Exception;
}
