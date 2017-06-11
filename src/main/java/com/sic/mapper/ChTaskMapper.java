package com.sic.mapper;

import com.sic.entity.ChTask;
import com.sic.entity.ChTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChTaskMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChTask record);

    int insertSelective(ChTask record);

    List<ChTask> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChTask record);

    int updateByPrimaryKey(ChTask record);
    ChTask selectByPrimaryKey(String id);
}