package cn.tomxin.jiandan_house.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/**
 * 用户信息
 *
 * @author tomxin
 * @version 1.0
 */
@Data
@Table(name = "user")
@Entity
public class User {

    @Id
    @Column(columnDefinition = "varchar(50) COMMENT 'openId'")
    private String openId;

    @Column(columnDefinition = "varchar(50) COMMENT '昵称'")
    private String nickName;

    @Column(columnDefinition = "varchar(2) COMMENT '性别'")
    private String gender;

    @Column(columnDefinition = "varchar(10) COMMENT '省份'")
    private String province;

    @Column(columnDefinition = "varchar(10) COMMENT '城市'")
    private String city;

    @Column(columnDefinition = "varchar(10) COMMENT '年龄'")
    private String year;

    @Transient
    private String token;
    /**
     * 记录列表
     */
    @Transient
    private List<Record> recordList;

}
