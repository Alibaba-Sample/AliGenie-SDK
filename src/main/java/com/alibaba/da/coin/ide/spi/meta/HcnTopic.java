/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年7月23日
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

import java.util.Map;

/**
 * 智能聊天的topic
 * 
 * @author xinqi.zq 2019年7月23日 下午4:55:41
 */
public class HcnTopic {
    private Long                topicId;

    private String              topicName;

    private String              actionName;

    private Map<String, String> knowledge;

    private Map<String, String> topicParams;

    /**
     * @return the topicId
     */
    public Long getTopicId() {
        return topicId;
    }

    /**
     * @param topicId the topicId to set
     */
    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    /**
     * @return the topicName
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * @param topicName the topicName to set
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * @return the actionName
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * @param actionName the actionName to set
     */
    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    /**
     * @return the knowledge
     */
    public Map<String, String> getKnowledge() {
        return knowledge;
    }

    /**
     * @param knowledge the knowledge to set
     */
    public void setKnowledge(Map<String, String> knowledge) {
        this.knowledge = knowledge;
    }

    public Map<String, String> getTopicParams() {
        return topicParams;
    }

    public void setTopicParams(Map<String, String> topicParams) {
        this.topicParams = topicParams;
    }

    @Override
    public String toString() {
        return "HcnTopic{" +
            "topicId=" + topicId +
            ", topicName='" + topicName + '\'' +
            ", actionName='" + actionName + '\'' +
            ", knowledge=" + knowledge +
            ", topicParams=" + topicParams +
            '}';
    }
}
