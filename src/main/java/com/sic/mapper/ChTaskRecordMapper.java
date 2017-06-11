package com.sic.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.sic.entity.ChTaskRecord;
@Mapper
public interface ChTaskRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChTaskRecord record);

    int insertSelective(ChTaskRecord record);

    List<ChTaskRecord> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChTaskRecord record);

    int updateByPrimaryKey(ChTaskRecord record);
}