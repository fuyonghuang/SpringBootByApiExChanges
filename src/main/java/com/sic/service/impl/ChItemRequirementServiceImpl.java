package com.sic.service.impl;

import com.sic.entity.ChItemRequirement;
import com.sic.entity.ChTaskRecord;
import com.sic.mapper.ChItemRequirementMapper;
import com.sic.service.ChItemRequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChItemRequirementServiceImpl implements ChItemRequirementService {

	@Autowired
	private ChItemRequirementMapper chItemRequirementMapper;
	@Override
	public List<ChItemRequirement> select(ChTaskRecord chTaskRecord) {
		// TODO Auto-generated method stub
		return chItemRequirementMapper.select(chTaskRecord);
	}

	@Override
	public int insert(List<ChItemRequirement> chItemRequirementList) {
		int i=0;
		for (ChItemRequirement bean:chItemRequirementList ) {
			chItemRequirementMapper.insert( bean );
		}
		return i;
	}

}
