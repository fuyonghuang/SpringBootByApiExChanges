package com.sic.mapper;

import com.sic.entity.ChFormItem;
import com.sic.entity.ChTaskRecord;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ChFormItemMapper {
    int deleteByPrimaryKey(String id);

    int insert(ChFormItem record);

    int insertSelective(ChFormItem record);

    List<ChFormItem> select(ChTaskRecord chTaskRecord);

    int updateByPrimaryKeySelective(ChFormItem record);

    int updateByPrimaryKey(ChFormItem record);
    ChFormItem selectByPrimaryKey(String id);
}