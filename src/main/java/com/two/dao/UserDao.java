package com.two.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.two.entity.Records;
import com.two.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserDao extends BaseMapper<User> {
    @Select("select * from records where user_id=#{user_id}")
    public List<Records> getByUserId(Integer user_id);
}
