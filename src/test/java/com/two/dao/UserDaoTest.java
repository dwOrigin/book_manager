package com.two.dao;

import com.two.domain.User;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
public class UserDaoTest {
    @Autowired
    private UserDao UserDao;
    @Test
    public void Testsave(){
        User user=new User();
        user.setPassword("1");
        user.setState(0);
        user.setPhoneNumber("2");
        user.setOrAdmin(0);
        user.setName("瓜皮");
        //UserDao.insert(user);
        UserDao.deleteById(1);
    }

}