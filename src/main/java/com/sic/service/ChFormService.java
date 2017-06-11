package com.sic.service;

import com.sic.entity.ChForm;
import com.sic.entity.ChTaskRecord;

import java.util.List;

public interface ChFormService {

	List<ChForm> select(ChTaskRecord chTaskRecord);

    int insert(ChForm chForm);

    ChForm selectByPrimaryKey(String id);
}
