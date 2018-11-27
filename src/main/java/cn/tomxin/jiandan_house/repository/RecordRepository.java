package cn.tomxin.jiandan_house.repository;

import cn.tomxin.jiandan_house.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordRepository extends JpaRepository<Record, Integer> {
    List<Record> findRecordsByOpenId(String openId);

    Record findRecordById(String id);
}
