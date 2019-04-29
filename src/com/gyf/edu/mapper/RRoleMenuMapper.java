package com.gyf.edu.mapper;

import com.gyf.edu.model.RRoleMenu;

public interface RRoleMenuMapper {
    int deleteByPrimaryKey(String id);

    int insert(RRoleMenu record);

    int insertSelective(RRoleMenu record);

    RRoleMenu selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RRoleMenu record);

    int updateByPrimaryKey(RRoleMenu record);
}