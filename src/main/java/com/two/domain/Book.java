package com.two.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("book")
public class Book {
    private Integer id;
    private String name;
    private String press;
    private String author;
    private Integer totalNumber;
    private Integer bookID;

}
