package com.two.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.two.common.Result;
import com.two.entity.Book;
import com.two.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    public Result changeUser(User user);
//用户增
//    用户删
//    用户改
//    用户查
//    用户借书
    public List<Book> queryAllBook(User user);
}
