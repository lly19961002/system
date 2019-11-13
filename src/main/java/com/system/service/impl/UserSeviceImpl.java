package com.system.service.impl;

import com.github.pagehelper.PageInfo;
import com.system.dao.BaseDao;
import com.system.dao.UserDao;
import com.system.entity.Result;
import com.system.entity.User;
import com.system.service.UserService;
import com.system.util.Page;
import com.system.util.PageSize50;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserSeviceImpl extends BaseServiceImpl<User> implements UserService  {

    @Resource
    UserDao userDao;
    @Override
    public BaseDao<User> getDao() {
        return this.userDao;
    }

    @PageSize50
    @Override
    public PageInfo<User> selectForPage(Page<User> search) {
        List<User> userList=userDao.findList(search.getView());
        return new PageInfo<>(userList);

    }


    @Override
    public void insertUser(User user){
        userDao.insertUser(user);
    }

    @Override
    public Result login(String username, String password){
        Map map = new HashMap();
        String pass=userDao.getPassword(username);
        if(pass.equals(password)){
            return new Result(0, "登录成功！", null);
        }
        else if(pass.equals("")){
            return new Result(1, "登录失败，密码错误！", null);
        }else{
            return new Result(1, "登录失败，用户不存在！", null);
        }

    }



}
