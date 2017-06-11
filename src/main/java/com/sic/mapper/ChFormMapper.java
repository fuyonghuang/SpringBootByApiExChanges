package com.sic.mapper;

import com.sic.entity.ChForm;
import com.sic.entity.ChTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChFormMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChForm record);

    int insertSelective(ChForm record);

    List<ChForm> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChForm record);

    int updateByPrimaryKey(ChForm record);
    ChForm selectByPrimaryKey(String id);
}