package com.sic.service;

import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChTaskRecordService {

	List<ChTaskRecord> select(ChTaskRecord chTaskRecord);

    int insert(ChTaskRecord chTaskRecordList);
    int updateByPrimaryKeySelective(ChTaskRecord record);

    int updateByPrimaryKey(ChTaskRecord record);
}
