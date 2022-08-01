package com.two.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.two.domain.Book;


public interface IBookService extends IService<Book> {
    boolean modify(Book book);
    boolean delete(Integer id);

}
