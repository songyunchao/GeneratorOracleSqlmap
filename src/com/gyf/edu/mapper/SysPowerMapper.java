package com.gyf.edu.mapper;

import com.gyf.edu.model.SysPower;

public interface SysPowerMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysPower record);

    int insertSelective(SysPower record);

    SysPower selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysPower record);

    int updateByPrimaryKeyWithBLOBs(SysPower record);

    int updateByPrimaryKey(SysPower record);
}