package com.system.service;

import com.github.pagehelper.PageInfo;
import com.system.entity.ext.TrainTupleExt;
import com.system.util.Page;

public interface InfoClassService {

    PageInfo<TrainTupleExt> selectForPage(Page<TrainTupleExt> search);

    TrainTupleExt getObject(TrainTupleExt search);

    Integer insert(TrainTupleExt trainTupleExt);

    Integer update(TrainTupleExt trainTupleExt);

    Integer delete(TrainTupleExt trainTupleExt);
}
