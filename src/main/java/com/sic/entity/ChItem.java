package com.sic.entity;


import java.util.Date;

public class ChItem {
    private String id;

    private String chItemId;

    private String parentId;

    private Long type;

    private String name;

    private String content;

    private String choice;

    private String itemRequirementId;

    private Long visibleLevel;

    private Long editLevel;

    private String visibleFlag;

    private String newFlag;

    private String createBy;

    private String createOfficeId;

    private Date createDate;

    private String updateBy;

    private String updateOfficeId;

    private Date updateDate;

    private String remarks;

    private String delFlag;

    private String systemFlag;

    private Long status;

    private Long remarkLevel;

    private Long fileLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChItemId() {
        return chItemId;
    }

    public void setChItemId(String chItemId) {
        this.chItemId = chItemId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getItemRequirementId() {
        return itemRequirementId;
    }

    public void setItemRequirementId(String itemRequirementId) {
        this.itemRequirementId = itemRequirementId;
    }

    public Long getVisibleLevel() {
        return visibleLevel;
    }

    public void setVisibleLevel(Long visibleLevel) {
        this.visibleLevel = visibleLevel;
    }

    public Long getEditLevel() {
        return editLevel;
    }

    public void setEditLevel(Long editLevel) {
        this.editLevel = editLevel;
    }

    public String getVisibleFlag() {
        return visibleFlag;
    }

    public void setVisibleFlag(String visibleFlag) {
        this.visibleFlag = visibleFlag;
    }

    public String getNewFlag() {
        return newFlag;
    }

    public void setNewFlag(String newFlag) {
        this.newFlag = newFlag;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateOfficeId() {
        return createOfficeId;
    }

    public void setCreateOfficeId(String createOfficeId) {
        this.createOfficeId = createOfficeId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUpdateOfficeId() {
        return updateOfficeId;
    }

    public void setUpdateOfficeId(String updateOfficeId) {
        this.updateOfficeId = updateOfficeId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getSystemFlag() {
        return systemFlag;
    }

    public void setSystemFlag(String systemFlag) {
        this.systemFlag = systemFlag;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getRemarkLevel() {
        return remarkLevel;
    }

    public void setRemarkLevel(Long remarkLevel) {
        this.remarkLevel = remarkLevel;
    }

    public Long getFileLevel() {
        return fileLevel;
    }

    public void setFileLevel(Long fileLevel) {
        this.fileLevel = fileLevel;
    }
}