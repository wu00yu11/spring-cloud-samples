package com.learn.springcloud.api;

import lombok.Data;

import java.io.Serializable;

/**
 * @author
 * @describe:
 * @create 2018-06-20 17:42
 **/
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 2186205608216206618L;

    private String name;

    private Integer age;

    private String  sex;
}
