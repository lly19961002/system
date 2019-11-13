package com.system.api;

import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageInfo;
import com.alibaba.fastjson.JSONObject;
import com.system.entity.Result;
import com.system.entity.User;
import com.system.service.UserService;
import com.system.service.impl.CommonService;
import com.system.util.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Resource
    UserService userService;
    @Resource
    CommonService commonService;

    @RequestMapping(value = "/login")
    public Result login(@RequestParam String username , @RequestParam String password){
       return userService.login( username, password);
//        if(result.equals(false)){
//            return new Result(1, "登录失败！", null);
//        }
//        else{
//            return new Result(0, "登录成功！", null);
//        }
    }

    @RequestMapping(value = "/select/selectForPage")
    public Result selectForPage(String jsonStr){
        Page<User> search = JSONObject.parseObject(jsonStr, new TypeReference<Page<User>>() {
        });
        PageInfo<User> result=userService.selectForPage(search);
        Map map=new HashMap();
        map.put("resultList",result.getList());
        map.put("totalSize",result.getTotal());
        return new Result(map);
    }

    @RequestMapping(value = "/insert/insert")
    public Result insert(String jsonStr){
        User user=JSONObject.parseObject(jsonStr,User.class);
        commonService.getsessionAndSet(user);
        userService.insertUser(user);
        return Result.SUCCESS;
    }

}
