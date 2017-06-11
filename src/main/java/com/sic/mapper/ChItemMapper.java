package com.sic.mapper;

import com.sic.entity.ChItem;
import com.sic.entity.ChTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChItem record);

    int insertSelective(ChItem record);

    List<ChItem> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChItem record);

    int updateByPrimaryKey(ChItem record);
    ChItem selectByPrimaryKey(String id);
}