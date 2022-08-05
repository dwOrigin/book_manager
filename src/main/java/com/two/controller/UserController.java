package com.two.controller;

import com.two.common.Result;
import com.two.entity.Book;
import com.two.entity.User;
import com.two.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //查看所有数据
    @Autowired
    private IUserService userService;
    @GetMapping
    public List<User> getAll(){
       System.out.println("show all message");
       return userService.list();//初始化内容
   }
    @PostMapping
    public Boolean save(@RequestBody User user){
        return userService.save(user);
    }
    //改
    @PutMapping
    public Boolean update(@RequestBody User user){
        return userService.update(user,null);
    }
    //删
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return userService.removeById(id);
    }
    //查
    @GetMapping("{id}")
    public User getById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @PostMapping("/change")
    public Result change(@RequestBody User user){return userService.changeUser(user);}
@GetMapping("/records/{id}")
    public List<Book> records(@PathVariable Integer id){
        return userService.queryAllBook(id);
}
//借书
@GetMapping("/record/borrow/{user_id}/{book_id}")
    public Result borrowBook(@PathVariable Integer user_id,@PathVariable Integer book_id){
    return userService.borrowBook(book_id,user_id);

}
//还书
    @GetMapping("/record/return/{user_id}/{book_id}")
    public Result returnBook(@PathVariable Integer user_id,@PathVariable Integer book_id){
return userService.returnBook(book_id,user_id);

    }
}