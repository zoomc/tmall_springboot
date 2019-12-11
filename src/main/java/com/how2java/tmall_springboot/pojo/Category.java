package com.how2java.tmall_springboot.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity //表示实体类
@Table(name = "category") //表名
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" }) //忽略项

public class Category {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY ) //自增策略
    @Column(name = "id") //映射字段
    Integer id;

    String name; //默认name的自带映射字段

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
