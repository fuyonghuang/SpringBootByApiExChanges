package com.sic.service.impl;

import com.sic.entity.ChTask;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChTaskMapper;
import com.sic.service.ChTaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChTaskServiceImpl implements ChTaskService {
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	@Autowired
	private ChTaskMapper chTaskMapper;


	
	@Override
	public List<ChTask> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chTaskMapper.select(chTaskRecord);
	}

	@Override
	public int insert(ChTask record) {
		int i=0;
			if(chTaskMapper.selectByPrimaryKey(record.getId())==null){
				i=chTaskMapper.insert(record);
			}else{
			logger.debug( "该记录已经存在不需要更新" );
			}
		return i;
	}

	@Override
	public ChTask selectByPrimaryKey(String id) {
		return chTaskMapper.selectByPrimaryKey(id);
	}

}
