package com.sic.service;

import com.sic.entity.ChFormItem;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChFormItemService {

	List<ChFormItem> select(ChTaskRecord chTaskRecord);

	int insert(List<ChFormItem> chFormItemList);
}
