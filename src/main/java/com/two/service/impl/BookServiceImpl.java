package com.two.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.two.dao.BookDao;
import com.two.domain.Book;
import com.two.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

   @Autowired
   BookDao bookDao;


    @Override
    public boolean modify(Book book) {
        return bookDao.updateById(book)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id)>0;
    }

   /* @Override
    public IPage<Book> getPage(int currentPage,int pageSize) {
        IPage<Book> page=new Page<Book>(currentPage,pageSize);
        bookDao.selectPage(page,null);
        return page;
    }*/

//    @Override
    /*public IPage<Book> getPage(int currentPage, int pageSize, Book book) {
        *//*
         * 使用封装条件
         * *//*
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        return page;
    }*/
/*
    *like(判断是否进行后续判断，判断范围，待判断值)
    *按条件查询的时候用到的
*/
       /* lqw.like(Strings.isNotEmpty(book.getType()),Book::getType,book.getType());
        lqw.like(Strings.isNotEmpty(book.getName()),Book::getName,book.getName());
        lqw.like(Strings.isNotEmpty(book.getDescription()),Book::getDescription,book.getDescription());
        IPage<Book> page=new Page<Book>(currentPage,pageSize);*/
/*
* 漏加lqw了
* */
     /*   bookDao.selectPage(page,lqw);
       */

}
