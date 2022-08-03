package com.two.controller;

import com.two.common.Result;
import com.two.entity.User;
import com.two.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
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

    @PostMapping("/user/change")
    public Result change(@RequestBody User user){return null;}
}