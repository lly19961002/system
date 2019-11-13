package com.system.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.system.entity.User;
import com.system.service.impl.BaseServiceImpl;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

public interface BaseService<Model> {

    /**
     * 插入对象
     */
    Integer insert(Model model);

    /**
     * 更新对象，如果更新行数为0，抛异常。
     *

     */
    Integer update(Model model);


    Integer updateAll(Model model);


    /**
     * 通过主键, 删除对象

     */
    Integer delete(Model model);


    /**
     * 通过主键, 查询对象
     *
     */
    Model getObjectById(Model model);

    /**
     * 查询多个对象
     *
     * @return 对象集合
     */
    PageInfo<Model> findList(Example example);

    Class<? extends BaseServiceImpl> getCurrentClass();

}
