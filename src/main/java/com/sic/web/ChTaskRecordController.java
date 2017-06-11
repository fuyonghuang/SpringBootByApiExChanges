package com.sic.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.sic.entity.*;
import com.sic.service.*;

@RestController
public class ChTaskRecordController {
	
	@Autowired
	private ChTaskRecordService chTaskRecordService;
	
	@Autowired
	private ChTaskService chTaskService;

	@Autowired
	private ChFormService chFormService;
	
	@Autowired
	private ChItemRecordService chItemRecordService;
	
	@Autowired
	private ChFormItemService chFormItemService;
	
	@Autowired
	private ChItemService chItemService;
	
	@Autowired
	private ChItemRequirementService chItemRequirementService;
	
	@GetMapping(value = "/select")
	public Map select(@RequestParam("officeId") String officeId,@RequestParam("status") Long status){
		Map<String,Object> map=new HashMap<String,Object>();
		ChTaskRecord chTaskRecord=new ChTaskRecord();
 		chTaskRecord.setStatus(status);
		chTaskRecord.setOfficeId(officeId);
		List<ChTaskRecord> chTaskRecordList=chTaskRecordService.select(chTaskRecord);	
		List<ChTask> chTask=chTaskService.select(chTaskRecord);
		List<ChForm> chForm=chFormService.select(chTaskRecord);
		List<ChItemRecord> chItemRecord=chItemRecordService.select(chTaskRecord);
		List<ChFormItem> chFormItem=chFormItemService.select(chTaskRecord);
		List<ChItem> chItem=chItemService.select(chTaskRecord);
		List<ChItemRequirement> chItemRequirement=chItemRequirementService.select(chTaskRecord);	
		map.put("chTaskRecord", chTaskRecordList);
		map.put("chTask", chTask);
		map.put("chForm", chForm);
		map.put("chItemRecord", chItemRecord);
		map.put("chFormItem", chFormItem);
		map.put("chItem", chItem);
		map.put("chItemRequirement", chItemRequirement);
		return map;
	}
}
