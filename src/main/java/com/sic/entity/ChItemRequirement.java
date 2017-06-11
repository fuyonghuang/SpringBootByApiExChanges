package com.sic.entity;

import java.util.Date;

public class ChItemRequirement {
    private String id;

    private String taskId;

    private String formItemId;

    private Long required;

    private Long method;

    private String defaultAnswer;

    private Long rangeRule;

    private Long rangeLnumber;

    private Long rangeRnumber;

    private Date rangeLtime;

    private Date rangeRtime;

    private String rangeString;

    private Long score;

    private Long rangeLevel;

    private String itemId;

    private Long alarmLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getFormItemId() {
        return formItemId;
    }

    public void setFormItemId(String formItemId) {
        this.formItemId = formItemId;
    }

    public Long getRequired() {
        return required;
    }

    public void setRequired(Long required) {
        this.required = required;
    }

    public Long getMethod() {
        return method;
    }

    public void setMethod(Long method) {
        this.method = method;
    }

    public String getDefaultAnswer() {
        return defaultAnswer;
    }

    public void setDefaultAnswer(String defaultAnswer) {
        this.defaultAnswer = defaultAnswer;
    }

    public Long getRangeRule() {
        return rangeRule;
    }

    public void setRangeRule(Long rangeRule) {
        this.rangeRule = rangeRule;
    }

    public Long getRangeLnumber() {
        return rangeLnumber;
    }

    public void setRangeLnumber(Long rangeLnumber) {
        this.rangeLnumber = rangeLnumber;
    }

    public Long getRangeRnumber() {
        return rangeRnumber;
    }

    public void setRangeRnumber(Long rangeRnumber) {
        this.rangeRnumber = rangeRnumber;
    }

    public Date getRangeLtime() {
        return rangeLtime;
    }

    public void setRangeLtime(Date rangeLtime) {
        this.rangeLtime = rangeLtime;
    }

    public Date getRangeRtime() {
        return rangeRtime;
    }

    public void setRangeRtime(Date rangeRtime) {
        this.rangeRtime = rangeRtime;
    }

    public String getRangeString() {
        return rangeString;
    }

    public void setRangeString(String rangeString) {
        this.rangeString = rangeString;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getRangeLevel() {
        return rangeLevel;
    }

    public void setRangeLevel(Long rangeLevel) {
        this.rangeLevel = rangeLevel;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Long getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(Long alarmLevel) {
        this.alarmLevel = alarmLevel;
    }
}