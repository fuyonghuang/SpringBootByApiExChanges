package com.sic.service.impl;

import com.sic.entity.ChItemRecord;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChItemRecordMapper;
import com.sic.service.ChItemRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChItemRecordServiceImpl implements ChItemRecordService {

	@Autowired
	private ChItemRecordMapper chItemRecordMapper;
	
	@Override
	public List<ChItemRecord> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chItemRecordMapper.select(chTaskRecord);
	}

	@Override
	public int insert(List<ChItemRecord> chItemRecordList) {
		int i=0;
		for (ChItemRecord bean:chItemRecordList){
			i = chItemRecordMapper.insert( bean );
		}
			return i;
	}

}
