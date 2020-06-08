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
package com.alibaba.da.coin.ide.spi.standard;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.alibaba.da.coin.ide.spi.meta.ConversationRecord;
import com.alibaba.da.coin.ide.spi.meta.Device;
import com.alibaba.da.coin.ide.spi.meta.SessionEntry;
import com.alibaba.da.coin.ide.spi.meta.SkillNluInfo;
import com.alibaba.da.coin.ide.spi.meta.SkillSession;
import com.alibaba.da.coin.ide.spi.meta.SlotEntity;

/**
 * TODO Comment of TaskQuery
 * 
 * @author xinqi.zq 2017年4月5日 上午10:55:23
 */
public class TaskQuery implements Serializable {
    /**
     * 
     */
    private static final long         serialVersionUID    = 1L;
    /**
     * sessionId session内的对话此ID相同
     */
    private String                    sessionId;

    /**
     * 用户输入语句
     */
    private String                    utterance;

    /**
     * 技能鉴权token，可以不需要，如果有安全需求需要配置
     */
    private String                    token;

    /**
     * 业务请求附带参数
     */
    private Map<String, String>       requestData         = null;

    /**
     * 应用ID（冗余字段，技能开发者不用关心）
     */
    private Long                      botId;

    /**
     * 领域ID（冗余字段，技能开发者不用关心）
     */
    private Long                      domainId;

    /**
     * 技能ID
     */
    private Long                      skillId;
    /**
     * 技能名称
     */
    private String                    skillName;

    /**
     * 意图ID
     */
    private Long                      intentId;
    /**
     * 意图名称
     */
    private String                    intentName;

    /**
     * 从用户语句中抽取出的slot信息
     */
    private List<SlotEntity>          slotEntities        = null;

    /**
     * 用户是否确认CONFIRMED/DENIED,上一轮时CONFIRM时生效
     */
    private String                    confirmStatus;

    /**
     * 用户选择index，上一轮是SELECT，并且selectIndexMatch=true时生效
     */
    private List<Integer>             selectIndexList;

    /**
     * 此session内的对话记录，按照时间倒序存放，最近的放在前面
     */
    private List<ConversationRecord>  conversationRecords = null;
    /**
     * 用户需要保存的上下文的信息
     */
    private Map<String, SessionEntry> sessionEntries;


    /**
     * 请求ID
     */
    private String                    requestId;

    /**
     * Instruction的额外信息
     */
    private Map<String, Object>       extendInfo;

    /**
     * skill nlu部分的辅助信息
     */
    private SkillNluInfo              skillNluInfo;

    /**
     * 设备相关信息
     */
    private Device                    device;

    /**
     * 技能粒度的session信息
     */
    private SkillSession              skillSession;

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

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
     * @return the utterance
     */
    public String getUtterance() {
        return utterance;
    }

    /**
     * @param utterance the utterance to set
     */
    public void setUtterance(String utterance) {
        this.utterance = utterance;
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
     * @return the requestData
     */
    public Map<String, String> getRequestData() {
        return requestData;
    }

    /**
     * @param requestData the requestData to set
     */
    public void setRequestData(Map<String, String> requestData) {
        this.requestData = requestData;
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

    /**
     * @return the confirmStatus
     */
    public String getConfirmStatus() {
        return confirmStatus;
    }

    /**
     * @param confirmStatus the confirmStatus to set
     */
    public void setConfirmStatus(String confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    /**
     * @return the selectIndexList
     */
    public List<Integer> getSelectIndexList() {
        return selectIndexList;
    }

    /**
     * @param selectIndexList the selectIndexList to set
     */
    public void setSelectIndexList(List<Integer> selectIndexList) {
        this.selectIndexList = selectIndexList;
    }

    /**
     * @return the dialogRecords
     */
    public List<ConversationRecord> getDialogRecords() {
        return conversationRecords;
    }

    /**
     * @param conversationRecords the dialogRecords to set
     */
    public void setDialogRecords(List<ConversationRecord> conversationRecords) {
        this.conversationRecords = conversationRecords;
    }

    /**
     * @return the sessionEntries
     */
    public Map<String, SessionEntry> getSessionEntries() {
        return sessionEntries;
    }

    /**
     * @param sessionEntries the sessionEntries to set
     */
    public void setSessionEntries(Map<String, SessionEntry> sessionEntries) {
        this.sessionEntries = sessionEntries;
    }

    /**
     * @return the skillId
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     * @param skillId the skillId to set
     */
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    /**
     * @return the skillName
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * @param skillName the skillName to set
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    /**
     * @return the conversationRecords
     */
    public List<ConversationRecord> getConversationRecords() {
        return conversationRecords;
    }

    /**
     * @param conversationRecords the conversationRecords to set
     */
    public void setConversationRecords(List<ConversationRecord> conversationRecords) {
        this.conversationRecords = conversationRecords;
    }

    /**
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    public void setExtendInfo(Map<String, Object> extendInfo) {
        this.extendInfo = extendInfo;
    }

    /**
     * @return the skillNluInfo
     */
    public SkillNluInfo getSkillNluInfo() {
        return skillNluInfo;
    }

    /**
     * @param skillNluInfo the skillNluInfo to set
     */
    public void setSkillNluInfo(SkillNluInfo skillNluInfo) {
        this.skillNluInfo = skillNluInfo;
    }


    /**
     * @return the device
     */
    public Device getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * @return the skillSession
     */
    public SkillSession getSkillSession() {
        return skillSession;
    }

    /**
     * @param skillSession the skillSession to set
     */
    public void setSkillSession(SkillSession skillSession) {
        this.skillSession = skillSession;
    }

}
