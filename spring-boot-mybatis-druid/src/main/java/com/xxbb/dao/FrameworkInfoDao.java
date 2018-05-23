package com.xxbb.dao;

import com.xxbb.model.FrameworkInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface FrameworkInfoDao {
    @Select("select * from framework_info where id=#{id}")
    @Results(
            id = "frameworkInfo",
            value = {
                    @Result(column = "id", property = "id"),
                    @Result(column = "mvc_framework", property = "mvcFramework"),
                    @Result(column = "database", property = "database"),
                    @Result(column = "data_framework", property = "dataFramework"),
                    @Result(column = "build_tool", property = "buildTool"),
                    @Result(column = "logger", property = "logger"),
                    @Result(column = "distributed", property = "distributed"),
                    @Result(column = "message_queue", property = "messageQueue")
            }
    )
    FrameworkInfo findById(Long id);
}
