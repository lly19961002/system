package com.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.system.dao.BaseDao;
import com.system.dao.InfoClassDao;
import com.system.dao.TrainTupleDao;
import com.system.entity.TrainTuple;
import com.system.entity.ext.TrainTupleExt;
import com.system.service.InfoClassService;
import com.system.util.Page;
import com.system.util.PageSize50;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class InfoClassServiceImpl  implements InfoClassService{

    @Resource
    TrainTupleDao trainTupleDao;

    @PageSize50
    @Override
    public PageInfo<TrainTupleExt> selectForPage(Page<TrainTupleExt> search)  {
        PageHelper.startPage(search.getPageNo(), search.getPageSize());
        List<TrainTupleExt> trainTupleExtList=trainTupleDao.findList(search.getView());
        return new PageInfo<TrainTupleExt>(trainTupleExtList);
    }


    @Override
    public TrainTupleExt getObject(TrainTupleExt search){
        return trainTupleDao.selectByPrimaryKey(search.getId());
    }

    @Override
    public Integer insert(TrainTupleExt trainTupleExt){
        return trainTupleDao.insert(trainTupleExt);
    }

    @Override
    public Integer update(TrainTupleExt trainTupleExt){
        return trainTupleDao.updateByPrimaryKeySelective(trainTupleExt);
    }

    @Override
    public Integer delete(TrainTupleExt trainTupleExt){
        return trainTupleDao.deleteByPrimaryKey(trainTupleExt.getId());
    }
}
