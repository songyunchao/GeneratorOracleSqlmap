package com.gyf.edu.mapper;

import com.gyf.edu.model.SysSettings;

public interface SysSettingsMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSettings record);

    int insertSelective(SysSettings record);

    SysSettings selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysSettings record);

    int updateByPrimaryKey(SysSettings record);
}