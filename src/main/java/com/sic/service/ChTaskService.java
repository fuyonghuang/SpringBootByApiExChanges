package com.sic.service;

import com.sic.entity.ChTask;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChTaskService {

	List<ChTask> select(ChTaskRecord chTaskRecord);
    int insert(ChTask record);
    ChTask selectByPrimaryKey(String id);
}
