/**
 * Project: coin-ide-share
 * 
 * File Created at 2017年4月5日
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.da.coin.ide.spi.meta;

/**
 * TODO Comment of SlotEntity
 * 
 * @author xinqi.zq 2017年4月5日 上午10:57:21
 */
public class SlotEntity {

    /**
     * paramId
     */
    private Long    intentParameterId;

    /**
     * paramName
     */
    private String  intentParameterName;
    /**
     * 原始抽取值，从语句中直接抽取出的值
     */
    private String  originalValue;

    /**
     * 转换后的值
     */
    private String  standardValue;

    /**
     * 归一化后的值
     */
    private String  slotNorm;

    /**
     * 生存时间
     */
    private Integer liveTime;
    /**
     * 创建时间点
     */
    private Long    createTimeStamp;

    /**
     * 是否来自上下文模型
     */
    private Boolean fromContext;

    /**
     * slot置信度
     */
    private Double  score;
    /**
     * slot来源信息，TEXT代表来自于原始文本，PHONE代表来自于音频特征
     */
    private String  slotSource;

    /**
     * slotName
     */
    @Deprecated
    private String  slotName;
    /**
     * slotValue
     */
    @Deprecated
    private String  slotValue;

    /**
     * @return the intentParameterId
     */
    public Long getIntentParameterId() {
        return intentParameterId;
    }

    /**
     * @param intentParameterId the intentParameterId to set
     */
    public void setIntentParameterId(Long intentParameterId) {
        this.intentParameterId = intentParameterId;
    }

    /**
     * @return the intentParameterName
     */
    public String getIntentParameterName() {
        return intentParameterName;
    }

    /**
     * @param intentParameterName the intentParameterName to set
     */
    public void setIntentParameterName(String intentParameterName) {
        this.intentParameterName = intentParameterName;
    }

    /**
     * @return the originalValue
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * @param originalValue the originalValue to set
     */
    public void setOriginalValue(String originalValue) {
        this.originalValue = originalValue;
    }

    /**
     * @return the standardValue
     */
    public String getStandardValue() {
        return standardValue;
    }

    /**
     * @param standardValue the standardValue to set
     */
    public void setStandardValue(String standardValue) {
        this.standardValue = standardValue;
    }

    /**
     * @return the liveTime
     */
    public Integer getLiveTime() {
        return liveTime;
    }

    /**
     * @param liveTime the liveTime to set
     */
    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * @return the createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    /**
     * @param createTimeStamp the createTimeStamp to set
     */
    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    /**
     * @return the slotName
     */
    public String getSlotName() {
        return slotName;
    }

    /**
     * @param slotName the slotName to set
     */
    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * @return the slotValue
     */
    public String getSlotValue() {
        return slotValue;
    }

    /**
     * @param slotValue the slotValue to set
     */
    public void setSlotValue(String slotValue) {
        this.slotValue = slotValue;
    }

    /**
     * @return the slotNorm
     */
    public String getSlotNorm() {
        return slotNorm;
    }

    /**
     * @param slotNorm the slotNorm to set
     */
    public void setSlotNorm(String slotNorm) {
        this.slotNorm = slotNorm;
    }

    /**
     * @return the fromContext
     */
    public Boolean getFromContext() {
        return fromContext;
    }

    /**
     * @param fromContext the fromContext to set
     */
    public void setFromContext(Boolean fromContext) {
        this.fromContext = fromContext;
    }

    /**
     * @return the slotSource
     */
    public String getSlotSource() {
        return slotSource;
    }

    /**
     * @param slotSource the slotSource to set
     */
    public void setSlotSource(String slotSource) {
        this.slotSource = slotSource;
    }

    /**
     * @return the score
     */
    public Double getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(Double score) {
        this.score = score;
    }

}
