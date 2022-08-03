package com.two.dao;

//import com.two.domain.Book;
import com.two.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;
    @Test
    public void test(){
//        Book book = new Book(1,"weh","2","wo",1,1);
//        bookDao.insert(book);
    }
}