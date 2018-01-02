package com.swjtu.WJKeServers.mapper;

import com.swjtu.WJKeServers.entity.Area;
import com.swjtu.WJKeServers.entity.AreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaMapper {
    int countByExample(AreaExample example);

    int deleteByExample(AreaExample example);

    int deleteByPrimaryKey(String areaid);

    int insert(Area record);

    int insertSelective(Area record);

    List<Area> selectByExample(AreaExample example);

    Area selectByPrimaryKey(String areaid);

    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}