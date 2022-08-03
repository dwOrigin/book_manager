package com.two.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.two.common.Result;
import com.two.entity.User;

public interface IUserService extends IService<User> {
    public Result changeUser(User user);

}
