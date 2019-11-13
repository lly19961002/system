package com.system.dao;

import com.system.entity.TrainTuple;
import com.system.entity.ext.TrainTupleExt;

import java.util.List;

public interface TrainTupleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TrainTupleExt record);

    int insertSelective(TrainTupleExt record);

    TrainTupleExt selectByPrimaryKey(Integer id);

    /*
        更新非空的属性
     */
        int updateByPrimaryKeySelective(TrainTupleExt record);
    /*
        更新所有属性
     */
    int updateByPrimaryKey(TrainTupleExt record);

    List<TrainTupleExt> findList(TrainTupleExt trainTupleExt);
}