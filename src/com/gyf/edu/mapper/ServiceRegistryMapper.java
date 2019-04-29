package com.gyf.edu.mapper;

import com.gyf.edu.model.ServiceRegistry;
import com.gyf.edu.model.ServiceRegistryWithBLOBs;

public interface ServiceRegistryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ServiceRegistryWithBLOBs record);

    int insertSelective(ServiceRegistryWithBLOBs record);

    ServiceRegistryWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ServiceRegistryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ServiceRegistryWithBLOBs record);

    int updateByPrimaryKey(ServiceRegistry record);
}