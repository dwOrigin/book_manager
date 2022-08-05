package com.two.controller;

import com.two.dao.UserDao;
import com.two.entity.User;
import com.two.service.IUserService;
import com.two.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserControllerTest {
    @Autowired
    private IUserService userService;
    @Test
    void change() {
        User user = new User();
        user.setId("8");
        user.setOrAdmin(0);
        user.setName("d");
        user.setPassword("a");
        user.setState(1);
        user.setPhoneNumber("2");
        userService.changeUser(user);
    }
    @Test
    void queryBooks(){
        userService.queryAllBook(1);
    }
    @Test
    void borrowBookTest(){
        userService.borrowBook(1,9);
    }
    void returnBookTest(){
        userService.returnBook(1,9);
    }
}