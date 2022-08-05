package com.two.controller;

import com.two.entity.Book;
import com.two.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookControllerTest {
    @Autowired
    private IBookService bookService;

    @Test
    void delete() {
        Book book = new Book();
        book.setId(2);
        book.setName("weh");
        book.setPress("21");
        book.setTotalNumber(1);
        bookService.deleteBook(book);

    }
}