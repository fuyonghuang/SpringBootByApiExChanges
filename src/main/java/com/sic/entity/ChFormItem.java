package com.sic.entity;



public class ChFormItem {
    private String id;

    private String formId;

    private String itemId;

    private Long num;

    private String itemRequirementId;

    private String delFlag;

    private String systemFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getItemRequirementId() {
        return itemRequirementId;
    }

    public void setItemRequirementId(String itemRequirementId) {
        this.itemRequirementId = itemRequirementId;
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
}