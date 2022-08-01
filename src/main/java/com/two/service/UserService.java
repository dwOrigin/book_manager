package com.two.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.two.domain.User;

import java.util.List;

public interface UserService {
    boolean save(User user);
    boolean delete(String phoneNumber);
    boolean update(User user);
    User getById(String phoneNumber);
    List<User> getAll();
    IPage<User> getPage(int currentPage, int pageSize);
}
