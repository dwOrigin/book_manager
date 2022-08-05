package com.two.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.two.entity.Records;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RecordsDao extends BaseMapper<Records> {
}
