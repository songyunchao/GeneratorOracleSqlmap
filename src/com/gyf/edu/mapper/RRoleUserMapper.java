package com.gyf.edu.mapper;

import com.gyf.edu.model.RRoleUser;

public interface RRoleUserMapper {
    int deleteByPrimaryKey(String id);

    int insert(RRoleUser record);

    int insertSelective(RRoleUser record);

    RRoleUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RRoleUser record);

    int updateByPrimaryKey(RRoleUser record);
}