package com.sic.mapper;

import com.sic.entity.ChItemRecord;
import com.sic.entity.ChTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChItemRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChItemRecord record);

    int insertSelective(ChItemRecord record);

    List<ChItemRecord> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChItemRecord record);

    int updateByPrimaryKey(ChItemRecord record);

    ChItemRecord selectByPrimaryKey(String parma);
}