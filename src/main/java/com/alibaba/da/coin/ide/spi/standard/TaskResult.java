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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.da.coin.ide.spi.meta.Action;
import com.alibaba.da.coin.ide.spi.meta.AskedInfoMsg;
import com.alibaba.da.coin.ide.spi.meta.ConfirmParaInfo;
import com.alibaba.da.coin.ide.spi.meta.ExecuteCode;
import com.alibaba.da.coin.ide.spi.meta.GwCommand;
import com.alibaba.da.coin.ide.spi.meta.JumpIntent;
import com.alibaba.da.coin.ide.spi.meta.ReplyType;
import com.alibaba.da.coin.ide.spi.meta.ResultType;
import com.alibaba.da.coin.ide.spi.meta.SelectParaInfo;
import com.alibaba.da.coin.ide.spi.meta.SessionEntry;
import com.alibaba.da.coin.ide.spi.meta.SkillDialogSession;
import com.alibaba.da.coin.ide.spi.meta.SkillPostBizInfo;
import com.alibaba.da.coin.ide.spi.meta.SkillTraceInfo;
import com.alibaba.da.coin.ide.spi.meta.SlotEntity;

/**
 * TODO Comment of TaskResult
 * 
 * @author xinqi.zq 2017年4月5日 上午10:55:38
 */
public class TaskResult implements Serializable {
    /**
     * 
     */
    private static final long         serialVersionUID = 1L;

    /**
     * 回复语句
     */
    private String                    reply;

    /**
     * 回复类型
     */
    private ResultType                resultType;

    /**
     * reply类型
     */
    private ReplyType                 replyType;

    /**
     * ASK_INFO状态下必须填充追问的参数名以及意图ID
     */
    private List<AskedInfoMsg>        askedInfos;

    /**
     * skill生成的slot信息
     */
    private List<SlotEntity>          skillSlotEntities;

    /**
     * 执行结果附带的额外信息
     */
    private Map<String, String>       properties;

    /**
     * 模板附带的额外信息
     */
    private Map<String, String>       nlgProperties;

    /**
     * sessionEntries
     */
    private Map<String, SessionEntry> sessionEntries;

    private ExecuteCode               executeCode;

    private String                    msgInfo;

    /**
     * 播控类信息，放置播放音频等
     */
    @Deprecated
    private List<Action>              actions;

    /**
     * 最新版网关定义的command结构
     */
    private List<GwCommand>           gwCommands;

    private JumpIntent                jumpIntent;

    private SkillTraceInfo            skillTraceInfo;

    /**
     * 技能业务相关信息需要透给上游
     */
    private SkillPostBizInfo          skillPostBizInfo;

    /**
     * 技能执行侧关于会话session的信息，需要和nlusession联动
     */
    private SkillDialogSession        skillDialogSession;

    /**
     * intent parameter for match user utterance
     */
    private ConfirmParaInfo           confirmParaInfo;

    /**
     * select状态下需要填充多个候选信息
     */
    private SelectParaInfo            selectParaInfo;

    /**
     * @return the reply
     */
    public String getReply() {
        return reply;
    }

    /**
     * @param reply the reply to set
     */
    public void setReply(String reply) {
        this.reply = reply;
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
     * @return the properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
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
     * @return the executeCode
     */
    public ExecuteCode getExecuteCode() {
        return executeCode;
    }

    /**
     * @param executeCode the executeCode to set
     */
    public void setExecuteCode(ExecuteCode executeCode) {
        this.executeCode = executeCode;
    }

    /**
     * @return the msgInfo
     */
    public String getMsgInfo() {
        return msgInfo;
    }

    /**
     * @param msgInfo the msgInfo to set
     */
    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    /**
     * @return the askedInfos
     */
    public List<AskedInfoMsg> getAskedInfos() {
        return askedInfos;
    }

    /**
     * @param askedInfos the askedInfos to set
     */
    public void setAskedInfos(List<AskedInfoMsg> askedInfos) {
        this.askedInfos = askedInfos;
    }

    /**
     * @return the actions
     */
    public List<Action> getActions() {
        return actions;
    }

    public ReplyType getReplyType() {
        return replyType;
    }

    public void setReplyType(ReplyType replyType) {
        this.replyType = replyType;
    }

    public Map<String, String> getNlgProperties() {
        return nlgProperties;
    }

    public void setNlgProperties(Map<String, String> nlgProperties) {
        this.nlgProperties = nlgProperties;
    }

    /**
     * @param actions the actions to set
     */
    @Deprecated
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @Deprecated
    public void addAction(Action action) {
        if (this.actions == null) {
            this.actions = new ArrayList<Action>();
        }
        this.actions.add(action);
    }

    /**
     * @return the jumpIntent
     */
    public JumpIntent getJumpIntent() {
        return jumpIntent;
    }

    /**
     * @param jumpIntent the jumpIntent to set
     */
    public void setJumpIntent(JumpIntent jumpIntent) {
        this.jumpIntent = jumpIntent;
    }

    /**
     * @return the skillTraceInfo
     */
    public SkillTraceInfo getSkillTraceInfo() {
        return skillTraceInfo;
    }

    /**
     * @param skillTraceInfo the skillTraceInfo to set
     */
    public void setSkillTraceInfo(SkillTraceInfo skillTraceInfo) {
        this.skillTraceInfo = skillTraceInfo;
    }

    /**
     * @return the gwCommands
     */
    public List<GwCommand> getGwCommands() {
        return gwCommands;
    }

    /**
     * @param gwCommands the gwCommands to set
     */
    public void setGwCommands(List<GwCommand> gwCommands) {
        this.gwCommands = gwCommands;
    }

    /**
     * @return the skillPostBizInfo
     */
    public SkillPostBizInfo getSkillPostBizInfo() {
        return skillPostBizInfo;
    }

    /**
     * @param skillPostBizInfo the skillPostBizInfo to set
     */
    public void setSkillPostBizInfo(SkillPostBizInfo skillPostBizInfo) {
        this.skillPostBizInfo = skillPostBizInfo;
    }

    /**
     * @return the skillDialogSession
     */
    public SkillDialogSession getSkillDialogSession() {
        return skillDialogSession;
    }

    /**
     * @param skillDialogSession the skillDialogSession to set
     */
    public void setSkillDialogSession(SkillDialogSession skillDialogSession) {
        this.skillDialogSession = skillDialogSession;
    }

    /**
     * @return the confirmParaInfo
     */
    public ConfirmParaInfo getConfirmParaInfo() {
        return confirmParaInfo;
    }

    /**
     * @param confirmParaInfo the confirmParaInfo to set
     */
    public void setConfirmParaInfo(ConfirmParaInfo confirmParaInfo) {
        this.confirmParaInfo = confirmParaInfo;
    }

    /**
     * @return the selectParaInfo
     */
    public SelectParaInfo getSelectParaInfo() {
        return selectParaInfo;
    }

    /**
     * @param selectParaInfo the selectParaInfo to set
     */
    public void setSelectParaInfo(SelectParaInfo selectParaInfo) {
        this.selectParaInfo = selectParaInfo;
    }

    /**
     * @return the skillSlotEntities
     */
    public List<SlotEntity> getSkillSlotEntities() {
        return skillSlotEntities;
    }

    /**
     * @param skillSlotEntities the skillSlotEntities to set
     */
    public void setSkillSlotEntities(List<SlotEntity> skillSlotEntities) {
        this.skillSlotEntities = skillSlotEntities;
    }

}
