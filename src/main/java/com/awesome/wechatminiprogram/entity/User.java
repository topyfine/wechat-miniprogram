package com.awesome.wechatminiprogram.entity;

import lombok.Data;

@Data
public class User {
    public User(Long id) {
        this.id = id;
    }

    private Long id;
    private String name;
    private Integer age;
    private String email;
}