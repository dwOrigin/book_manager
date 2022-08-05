package com.two.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.two.common.Result;
import com.two.entity.Book;

public interface IBookService extends IService<Book> {
    Result addBook(Book book);

    Result changeBook(Book book);

    Result deleteBook(Book book);

}
