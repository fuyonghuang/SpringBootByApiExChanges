package com.sic.entity;

import lombok.Data;

import java.util.List;

/**
 * Created by fuyong_huang on 2017/6/9.
 */
@Data
public class CheckDataModel {
    private ChTaskRecord chTaskRecord;
    private ChTask chTask;
    private List<ChItemRecord> chItemRecordList;
    private ChForm chForm;
    private List<ChFormItem> chFormItemList;
    private List<ChItem> chItemList;
    private List<ChItemRequirement> chItemRequirementList;
}
