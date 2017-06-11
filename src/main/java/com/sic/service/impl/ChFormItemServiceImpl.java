package com.sic.service.impl;

import com.sic.entity.ChFormItem;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChFormItemMapper;
import com.sic.service.ChFormItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChFormItemServiceImpl implements ChFormItemService {

	@Autowired
	private ChFormItemMapper chFormItemMapper;
	
	@Override
	public List<ChFormItem> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chFormItemMapper.select(chTaskRecord);
	}

	@Override
	public int insert(List<ChFormItem> chFormItemList) {
		int i=0;
		for(ChFormItem bean:chFormItemList){
			if(chFormItemMapper.selectByPrimaryKey( bean.getId() )!=null){
				i=	chFormItemMapper.insert( bean );
			}
		}
		return i;
	}

}
