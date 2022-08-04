package com.two.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.common.Constants;
import com.two.common.Result;
import com.two.dao.UserDao;
import com.two.entity.Book;
import com.two.entity.User;
import com.two.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {


    @Override
    public Result changeUser(User user) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",user.getId());
        User one = getOne(queryWrapper);
        if(one == null){
            return Result.error(Constants.CODE_400,"修改失败");
        }else {
            update(user, queryWrapper);
            return Result.success(Constants.CODE_200,"修改成功");
        }
    }

    @Override
    public List<Book> queryAllBook(User user) {
        List<Book> allBooks = new ArrayList<Book>();
        System.out.println(userDao.getByUserId(2));
        return allBooks;
    }
}
