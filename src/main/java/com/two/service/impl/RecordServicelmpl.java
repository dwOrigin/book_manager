package com.two.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.two.dao.RecordsDao;
import com.two.entity.Records;
import com.two.service.RecordService;
import org.springframework.stereotype.Service;

@Service
public class RecordServicelmpl extends ServiceImpl<RecordsDao, Records> implements RecordService {
}
