package com.system.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.system.dao.BaseDao;
import com.system.entity.User;
import com.system.service.BaseService;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

public abstract class BaseServiceImpl<Model> implements BaseService<Model>{


    public abstract BaseDao<Model> getDao();
    @Override
    public Integer insert(Model model) {
        Integer row = getDao().insertSelective(model);
        return row;
    }

    /*
    更新不为空的属性
     */
    @Override
    public Integer update(Model model) {
        Integer row=getDao().updateByPrimaryKeySelective(model);
        return row;
    }

    /*
    更新所有属性
     */
    @Override
    public Integer updateAll(Model model) {
        Integer row=getDao().updateByPrimaryKey(model);
        return row;
    }

    /*
    通过主键删除
     */
    @Override
    public Integer delete(Model model) {
        Integer row=getDao().updateByPrimaryKey(model);
        return row;
    }

    /*
    通过主键查询对象
     */
    @Override
    public Model getObjectById(Model model) {
        model=getDao().selectByPrimaryKey(model);
        return model;
    }

    /*

     */
    @Override
    public PageInfo<Model> findList(Example example) {
        List<Model> list = getDao().selectByExample(example);
        return new PageInfo<Model>(list);
    }




    @Override
    public Class<? extends BaseServiceImpl> getCurrentClass() {
        return null;
    }
}
