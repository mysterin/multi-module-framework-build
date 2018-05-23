package com.xxbb.dao;

import com.xxbb.model.FrameworkInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FrameworkInfoDao {
    FrameworkInfo findById(Long id);
}
