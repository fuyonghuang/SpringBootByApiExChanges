package com.sic.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class ChItemRecord {
    private String id;

    private String taskRecordId;

    private String formItemId;

    private Long contentInt;

    private String contentString;

    private Date contentTimestamp;

    private String passFlag;

    private String remarks;

    private String content;

    private String fileIds;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskRecordId() {
        return taskRecordId;
    }

    public void setTaskRecordId(String taskRecordId) {
        this.taskRecordId = taskRecordId;
    }

    public String getFormItemId() {
        return formItemId;
    }

    public void setFormItemId(String formItemId) {
        this.formItemId = formItemId;
    }

    public Long getContentInt() {
        return contentInt;
    }

    public void setContentInt(Long contentInt) {
        this.contentInt = contentInt;
    }

    public String getContentString() {
        return contentString;
    }

    public void setContentString(String contentString) {
        this.contentString = contentString;
    }

    public Date getContentTimestamp() {
        return contentTimestamp;
    }

    public void setContentTimestamp(Date contentTimestamp) {
        this.contentTimestamp = contentTimestamp;
    }

    public String getPassFlag() {
        return passFlag;
    }

    public void setPassFlag(String passFlag) {
        this.passFlag = passFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFileIds() {
        return fileIds;
    }

    public void setFileIds(String fileIds) {
        this.fileIds = fileIds;
    }
}