package com.sic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sic.entity.ChItemRequirement;
import com.sic.entity.ChTaskRecord;
@Mapper
public interface ChItemRequirementMapper {
    int insert(ChItemRequirement record);

    int insertSelective(ChItemRequirement record);
    
    List<ChItemRequirement> select(ChTaskRecord chTaskRecord);
}