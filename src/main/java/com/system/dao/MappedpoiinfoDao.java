package com.system.dao;

import com.system.entity.Mappedpoiinfo;

public interface MappedpoiinfoDao {
    int deleteByPrimaryKey(Integer placeid);

    int insert(Mappedpoiinfo record);

    int insertSelective(Mappedpoiinfo record);

    Mappedpoiinfo selectByPrimaryKey(Integer placeid);

    int updateByPrimaryKeySelective(Mappedpoiinfo record);

    int updateByPrimaryKey(Mappedpoiinfo record);
}