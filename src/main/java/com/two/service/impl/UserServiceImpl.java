package com.two.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.dao.UserDao;
import com.two.domain.User;
import com.two.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {
    @Autowired
    UserDao userDao;
/*    @Override
    public boolean save(User user) {
        return userDao.insert(user)>0;
    }

    @Override
    public boolean delete(String phoneNumber) {
        return userDao.deleteById(phoneNumber)>0;
    }

    @Override
    public boolean update(User user) {
        return userDao.updateById(user)>0;
    }

    @Override
    public User getById(String phoneNumber) {
        return userDao.selectById(phoneNumber);
    }

    @Override
    public List<User> getAll() {
        return userDao.selectList(null);
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage page=new Page<User>(currentPage,pageSize);
        return userDao.selectPage(page,null);
    }*/
}
