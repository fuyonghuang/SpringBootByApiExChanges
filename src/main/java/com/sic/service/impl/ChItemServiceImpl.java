package com.sic.service.impl;

import com.sic.entity.ChItem;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChItemMapper;
import com.sic.service.ChItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChItemServiceImpl implements ChItemService {

	@Autowired
    private ChItemMapper chItemMapper;
	@Override
	public List<ChItem> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chItemMapper.select(chTaskRecord);
	}

	@Override
	public int insert(List<ChItem> chItemList) {
		int i=0;
		for (ChItem bean:chItemList){
			//判断chItem 记录是否存在，存在则不插入
			if(chItemMapper.selectByPrimaryKey(bean.getId())!=null) {
				i = chItemMapper.insert( bean );
			}
		}
		return i;
	}

}
