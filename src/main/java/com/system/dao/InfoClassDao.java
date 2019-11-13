package com.system.dao;


import com.system.entity.ext.TrainTupleExt;


import java.util.List;

public interface InfoClassDao extends BaseDao<TrainTupleExt>{

    List<TrainTupleExt> findList(TrainTupleExt trainTupleExt);


}
