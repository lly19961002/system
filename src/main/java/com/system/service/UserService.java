package com.system.service;

import com.github.pagehelper.PageInfo;
import com.system.entity.Result;
import com.system.entity.User;
import com.system.util.Page;

import java.util.Map;

public interface UserService extends BaseService<User> {

     PageInfo<User> selectForPage(Page<User> search);

     void insertUser(User user);

    Result login(String username, String password);


}
