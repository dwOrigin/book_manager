package com.two.domain;

import lombok.Data;

@Data
public class Book {
    private String bookName;
    private int bookID;
    private String press;
    private String author;
    private int totalNumber;
}
