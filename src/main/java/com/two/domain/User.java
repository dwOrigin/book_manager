package com.two.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "user")
public class User {
    private Integer id;
    private String password;
    private String name;
    private String phoneNumber;
    private Integer state;
    private Integer orAdmin;
}
