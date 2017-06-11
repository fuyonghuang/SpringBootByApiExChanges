package com.sic.service.impl;

import com.sic.entity.ChForm;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChFormMapper;
import com.sic.service.ChFormService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChFormServiceImpl implements ChFormService {
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	@Autowired
	private ChFormMapper chFormMapper;

	@Override
	public List<ChForm> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chFormMapper.select(chTaskRecord);
	}

	@Override
	public int insert(ChForm chForm) {
		int i=0;

			if(chFormMapper.selectByPrimaryKey(chForm.getId())!=null) {
				i = chFormMapper.insert( chForm );
			}else{
				logger.debug("该表单记录已经存在不需要同步");
			}

		return i;
	}

}
