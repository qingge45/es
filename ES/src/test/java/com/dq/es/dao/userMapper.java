package com.dq.es.dao;

import com.dq.es.pojo.user;

public interface userMapper {
    int deleteByPrimaryKey(Long id);

    int insert(user record);

    int insertSelective(user record);

    user selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(user record);

    int updateByPrimaryKeyWithBLOBs(user record);

    int updateByPrimaryKey(user record);
}