package cn.tomxin.jiandan_house.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.domain.Page;

import javax.persistence.*;

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
    @JsonIgnore
    private String gender;

    @Column(columnDefinition = "varchar(10) COMMENT '省份'")
    @JsonIgnore
    private String province;

    @Column(columnDefinition = "varchar(10) COMMENT '城市'")
    @JsonIgnore
    private String city;

    @Column(columnDefinition = "varchar(10) COMMENT '年龄'")
    @JsonIgnore
    private String year;

    @Transient
    private String token;
    /**
     * 记录列表
     */
    @Transient
    private Page<Record> recordList;

}
