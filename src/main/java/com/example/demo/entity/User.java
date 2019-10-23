package com.example.demo.entity;

import java.io.Serializable;

/**
 * SpringBootDemo1
 *
 * @author zhenhai.zheng
 * @date 2018年1月25日 11:25:38
 */
public class User implements Serializable{

    private static final long serialVersionUID = 934073895746700367L;
    private String id;
    private String name;
    private Integer age;

    public User() {
    }

    public User(Integer age, String id, String name) {
        super();
        this.age = age;
        this.id = id;
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
