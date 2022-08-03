package com.two.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.two.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
