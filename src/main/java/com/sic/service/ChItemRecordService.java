package com.sic.service;

import com.sic.entity.ChItemRecord;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChItemRecordService {

	 List<ChItemRecord> select(ChTaskRecord chTaskRecord);
	 int insert(List<ChItemRecord> chItemRecordList);
}
