/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年7月20日
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
 * skill nlu粒度的信息
 * 
 * @author xinqi.zq 2018年7月20日 上午10:58:13
 */
public class SkillNluInfo {

    /**
     * 是否是语音链路
     */
    private Boolean         isNluLink = true;

    /**
     * 识别到的所有意图信息
     */
    private List<RecIntent> recIntents;

    /**
     * 唤醒词
     */
    private String          invocationName;

    /**
     * 是否测试
     */
    private Boolean         isTest;

    /**
     * Select状态理解已完成
     */
    private Boolean         isSelectStatusComplete;

    /**
     * 意图回复模板配置
     */
    private NlgTemplates    nlgTemplates;

    /**
     * 用户confirm状态，上一轮replyType是CONFIRM时生效 取值CONFIRMED/DENIED
     */
    private String          confirmStaus;

    /**
     * 用户选择index，上一轮是SELECT，并且selectIndexMatch=true时生效
     */
    private List<Integer>   selectIndexList;

    /**
     * 墨提斯链路topic信息
     */
    private HcnTopic        hcnTopic;

    /**
     * @return the invocationName
     */
    public String getInvocationName() {
        return invocationName;
    }

    /**
     * @param invocationName the invocationName to set
     */
    public void setInvocationName(String invocationName) {
        this.invocationName = invocationName;
    }

    /**
     * @return the isTest
     */
    public Boolean getIsTest() {
        return isTest;
    }

    /**
     * @param isTest the isTest to set
     */
    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }

    /**
     * @return the isSelectStatusComplete
     */
    public Boolean getIsSelectStatusComplete() {
        return isSelectStatusComplete;
    }

    /**
     * @param isSelectStatusComplete the isSelectStatusComplete to set
     */
    public void setIsSelectStatusComplete(Boolean isSelectStatusComplete) {
        this.isSelectStatusComplete = isSelectStatusComplete;
    }

    /**
     * @return the isNluLink
     */
    public Boolean getIsNluLink() {
        return isNluLink;
    }

    /**
     * @param isNluLink the isNluLink to set
     */
    public void setIsNluLink(Boolean isNluLink) {
        this.isNluLink = isNluLink;
    }

    /**
     * @return the nlgTemplates
     */
    public NlgTemplates getNlgTemplates() {
        return nlgTemplates;
    }

    /**
     * @param nlgTemplates the nlgTemplates to set
     */
    public void setNlgTemplates(NlgTemplates nlgTemplates) {
        this.nlgTemplates = nlgTemplates;
    }

    /**
     * @return the recIntents
     */
    public List<RecIntent> getRecIntents() {
        return recIntents;
    }

    /**
     * @param recIntents the recIntents to set
     */
    public void setRecIntents(List<RecIntent> recIntents) {
        this.recIntents = recIntents;
    }

    /**
     * @return the confirmStaus
     */
    public String getConfirmStaus() {
        return confirmStaus;
    }

    /**
     * @param confirmStaus the confirmStaus to set
     */
    public void setConfirmStaus(String confirmStaus) {
        this.confirmStaus = confirmStaus;
    }


    /**
     * @return the selectIndexList
     */
    public List<Integer> getSelectIndexList() {
        return selectIndexList;
    }

    /**
     * @param selectIndex the selectIndexList to set
     */
    public void setSelectIndexList(List<Integer> selectIndex) {
        this.selectIndexList = selectIndex;
    }

    /**
     * @return the hcnTopic
     */
    public HcnTopic getHcnTopic() {
        return hcnTopic;
    }

    /**
     * @param hcnTopic the hcnTopic to set
     */
    public void setHcnTopic(HcnTopic hcnTopic) {
        this.hcnTopic = hcnTopic;
    }

}
