package com.msb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: luyuting
 * @Date: 2022/4/8 - 04 - 08 - 23:16
 * @Description: com.msb.pojo
 * @version: 1.0
 */
//构造函数含有所有已声明字段属性参数
@AllArgsConstructor
//加一个无参数的构造器
@NoArgsConstructor
//添加@Data注解可以不用再写
//getter,setter方法,
//toString方法
//hashCode方法
//equals方法
//等等
@Data
public class Person implements Serializable {
    private String pname;
    private String page;
    private String gender;
    private String[] hobby;
    @DateTimeFormat (pattern = "yyyy-mm-dd")
    private Date birthdate;
    private  Pet pet;
    private List<Pet>pets;
    private Map<String,Pet>petMap;


    }

