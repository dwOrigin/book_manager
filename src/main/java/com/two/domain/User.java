package com.two.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class User {
    private Integer id;
    private String passWord;
    private String name;
    private String phoneNumber;
    private Integer state;
    private Integer orAdmin;
}
