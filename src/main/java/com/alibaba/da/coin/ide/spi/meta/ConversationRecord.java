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

import java.util.List;


/**
 * TODO Comment of DialogRecord
 * 
 * @author xinqi.zq 2017年4月5日 上午10:59:27
 */
public class ConversationRecord {
    /**
     * 应用ID
     */
    private Long                   botId;

    /**
     * 输入语句
     */
    private String                 userInputUtterance;

    /**
     * 回复语句
     */
    private String                 replyUtterance;
    /**
     * domainId
     */
    private Long                   domainId;

    /**
     * 意图ID
     */
    private Long                   intentId;

    /**
     * 请求ID
     */
    private String                 requestId;

    /**
     * 意图名
     */
    private String                 intentName;

    /**
     * 该记录声称时间
     */
    private Long                   timestamp;
    /**
     * 回复状态
     */
    private ResultType             resultType;
    /**
     * slot信息
     */
    private List<SlotEntity>       slotEntities;

    /** 当前执行的Policy的名称（for 贾维斯） */
    private String                 policy;

    /** 当前执行的filter的名称（for 贾维斯） */
    private String                 filter;


    private List<AskedInfoMsg>     askedInfoMsgs;

    /**
     * @return the botId
     */
    public Long getBotId() {
        return botId;
    }

    /**
     * @param botId the botId to set
     */
    public void setBotId(Long botId) {
        this.botId = botId;
    }

    /**
     * @return the userInputUtterance
     */
    public String getUserInputUtterance() {
        return userInputUtterance;
    }

    /**
     * @param userInputUtterance the userInputUtterance to set
     */
    public void setUserInputUtterance(String userInputUtterance) {
        this.userInputUtterance = userInputUtterance;
    }

    /**
     * @return the replyUtterance
     */
    public String getReplyUtterance() {
        return replyUtterance;
    }

    /**
     * @param replyUtterance the replyUtterance to set
     */
    public void setReplyUtterance(String replyUtterance) {
        this.replyUtterance = replyUtterance;
    }

    /**
     * @return the domainId
     */
    public Long getDomainId() {
        return domainId;
    }

    /**
     * @param domainId the domainId to set
     */
    public void setDomainId(Long domainId) {
        this.domainId = domainId;
    }

    /**
     * @return the intentId
     */
    public Long getIntentId() {
        return intentId;
    }

    /**
     * @param intentId the intentId to set
     */
    public void setIntentId(Long intentId) {
        this.intentId = intentId;
    }

    /**
     * @return the intentName
     */
    public String getIntentName() {
        return intentName;
    }

    /**
     * @param intentName the intentName to set
     */
    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    /**
     * @return the timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp the timestamp to set
     */
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return the resultType
     */
    public ResultType getResultType() {
        return resultType;
    }

    /**
     * @param resultType the resultType to set
     */
    public void setResultType(ResultType resultType) {
        this.resultType = resultType;
    }

    /**
     * @return the slotEntities
     */
    public List<SlotEntity> getSlotEntities() {
        return slotEntities;
    }

    /**
     * @param slotEntities the slotEntities to set
     */
    public void setSlotEntities(List<SlotEntity> slotEntities) {
        this.slotEntities = slotEntities;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * @return the policy
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * @param policy the policy to set
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * @return the filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * @param filter the filter to set
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }





    /**
     * @return the askedInfoMsgs
     */
    public List<AskedInfoMsg> getAskedInfoMsgs() {
        return askedInfoMsgs;
    }

    /**
     * @param askedInfoMsgs the askedInfoMsgs to set
     */
    public void setAskedInfoMsgs(List<AskedInfoMsg> askedInfoMsgs) {
        this.askedInfoMsgs = askedInfoMsgs;
    }

}
