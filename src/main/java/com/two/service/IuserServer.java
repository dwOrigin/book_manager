package com.two.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.two.domain.User;

public interface IuserServer extends IService {
    boolean saveUser(User user);
    boolean modify(User user);
    boolean delete(String phoneNumber);

    IPage<User> getPage(int currentPage, int pageSize);
    IPage<User> getPage(int currentPage,int pageSize,User user);
}
