package com.two.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.common.Constants;
import com.two.common.Result;
import com.two.dao.BookDao;

import com.two.dao.RecordsDao;
import com.two.entity.Book;
import com.two.entity.Records;
import com.two.service.IBookService;
import com.two.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicelmp extends ServiceImpl<BookDao, Book> implements IBookService {
    @Autowired
    private BookDao bookDao;
    @Autowired
    private RecordService recordsDao;

    @Override
    public Result addBook(Book book) {
        if(bookDao.insert(book)==0){
            return Result.error(Constants.CODE_400,"添加失败");
        }else{
            return Result.success(Constants.CODE_200,"添加成功");
        }
    }

    @Override
    public Result changeBook(Book book) {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.eq("id",book.getId());
        Book one = getOne(wrapper);
        if(one == null){
            return Result.error(Constants.CODE_400,"修改书籍信息失败");
        }else {
            return Result.success(Constants.CODE_200,"修改书籍信息成功");
        }
    }

    @Override
    public Result deleteBook(Book book) {
        QueryWrapper<Book> wrapper = new QueryWrapper<>();
        wrapper.eq("id",book.getId());
        Book one = getOne(wrapper);
        if(one == null){
            return Result.error(Constants.CODE_400,"s删除失败");
        }else {
            baseMapper.delete(wrapper);
            QueryWrapper<Records> wrapper1 = new QueryWrapper<>();
            wrapper1.eq("book_id",book.getId());
            recordsDao.remove(wrapper1);
            return Result.success(Constants.CODE_200,"删除成功");
        }
    }
}
