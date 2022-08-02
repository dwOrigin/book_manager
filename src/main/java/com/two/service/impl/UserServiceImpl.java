package com.two.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.dao.UserDao;
import com.two.domain.User;
import com.two.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    @Autowired
    private UserDao userDao;
}
