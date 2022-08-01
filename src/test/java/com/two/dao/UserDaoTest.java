package com.two.dao;

import com.two.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void Testsave(){
        User user=new User();
        user.setPassWord("1");
        user.setState(0);
        user.setPhoneNumber("2");
        userDao.insert(user);
    }

}