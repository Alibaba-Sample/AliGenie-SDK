/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年8月14日
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
import java.util.Map;

/**
 * 开放平台配置的技能粒度对应的模板
 * 
 * @author xinqi.zq 2018年8月14日 下午7:17:03
 */
public class NlgTemplates {

    //回复节点与模板
    private Map<String, List<String>> replyNodesWithTemplate;

    //参数与其回复模板
    private Map<String, List<String>> paramWithTemplate;

    /**
     * @return the replyNodesWithTemplate
     */
    public Map<String, List<String>> getReplyNodesWithTemplate() {
        return replyNodesWithTemplate;
    }

    /**
     * @param replyNodesWithTemplate the replyNodesWithTemplate to set
     */
    public void setReplyNodesWithTemplate(Map<String, List<String>> replyNodesWithTemplate) {
        this.replyNodesWithTemplate = replyNodesWithTemplate;
    }

    /**
     * @return the paramWithTemplate
     */
    public Map<String, List<String>> getParamWithTemplate() {
        return paramWithTemplate;
    }

    /**
     * @param paramWithTemplate the paramWithTemplate to set
     */
    public void setParamWithTemplate(Map<String, List<String>> paramWithTemplate) {
        this.paramWithTemplate = paramWithTemplate;
    }

}
