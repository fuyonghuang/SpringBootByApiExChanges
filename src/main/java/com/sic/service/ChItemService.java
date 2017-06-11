package com.sic.service;

import com.sic.entity.ChItem;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChItemService {

	List<ChItem> select(ChTaskRecord chTaskRecord);
	int insert(List<ChItem> chItemList);
}
