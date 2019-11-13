package com.system.dao;

import com.system.entity.User;
import com.system.util.Page;

import java.util.List;
import java.util.Map;

public interface UserDao extends BaseDao<User> {

    List<User> findList(User user);

    void insertUser(User user);

    String getPassword(String username);

}
