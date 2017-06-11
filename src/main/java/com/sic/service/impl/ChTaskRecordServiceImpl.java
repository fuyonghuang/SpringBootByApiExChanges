package com.sic.service.impl;

import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChTaskRecordMapper;
import com.sic.service.ChTaskRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChTaskRecordServiceImpl implements ChTaskRecordService {

	@Autowired
	private  ChTaskRecordMapper chTaskRecordMapper;
	
	@Override
	public List<ChTaskRecord> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chTaskRecordMapper.select(chTaskRecord);
	}

	@Override
	public int insert(ChTaskRecord chTaskRecord) {
		chTaskRecord.setIsCity( "1" );
		int i=chTaskRecordMapper.insert(chTaskRecord);
		return i;
	}

	@Override
	public int updateByPrimaryKeySelective(ChTaskRecord record) {
		return chTaskRecordMapper.updateByPrimaryKeySelective( record );
	}

	@Override
	public int updateByPrimaryKey(ChTaskRecord record) {
		return chTaskRecordMapper.updateByPrimaryKey( record );
	}

}
