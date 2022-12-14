package com.two.controller;

import com.two.common.Result;
import com.two.entity.Book;
import com.two.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    //查看所有数据
    @Autowired
    private IBookService bookService;
    @GetMapping
    public List<Book> getAll(){
        System.out.println("show all message");
        return bookService.list();//初始化内容
    }
    @PostMapping
    public Boolean save(@RequestBody Book book){
        return bookService.save(book);
    }
    //改
    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book,null);
    }
    //删
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }
    //查
    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    /*
     *功能6
     */
    @PostMapping("/add")
    public Result add(@PathVariable Book book){return bookService.addBook(book);}
    /*
     *功能7
     */
    @PostMapping("/delete")
    public Result delete(@PathVariable Book book){return bookService.deleteBook(book);}
    /*
     *功能8
     */
    @PostMapping("/change")
    public Result change(@PathVariable Book book){return bookService.changeBook(book);};

}