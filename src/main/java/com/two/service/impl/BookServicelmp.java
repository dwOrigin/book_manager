package com.two.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.dao.BookDao;
import com.two.domain.Book;
import com.two.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicelmp extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
}
