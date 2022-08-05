package com.two.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.common.Constants;
import com.two.common.Result;
import com.two.dao.UserDao;
import com.two.entity.Book;
import com.two.entity.Records;
import com.two.entity.User;
import com.two.service.IUserService;
import com.two.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    @Autowired
    UserDao userDao;
    @Autowired
    RecordService recordService;

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

    @Override
    public void state(User user) {
        QueryWrapper<Records> wrapper = new QueryWrapper<>();
        wrapper.eq("user_id",user.getId());
        long num = recordService.count(wrapper);
        if(num >= 10){
            user.setState(0);
            userDao.updateById(user);
        }else {
            user.setState(1);
            userDao.updateById(user);
        }
    }
}
