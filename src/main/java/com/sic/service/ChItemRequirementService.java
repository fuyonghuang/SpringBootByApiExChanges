package com.sic.service;

import com.sic.entity.ChItemRequirement;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChItemRequirementService {

	List<ChItemRequirement> select(ChTaskRecord chTaskRecord);

    int insert(List<ChItemRequirement> chItemRequirementList);
}
