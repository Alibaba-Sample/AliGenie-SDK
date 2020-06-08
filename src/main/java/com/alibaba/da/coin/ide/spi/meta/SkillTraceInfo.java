/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年7月18日
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

import java.util.HashMap;
import java.util.Map;

/**
 * skill执行过程中的追踪信息，用于打点，效果统计等
 * 
 * @author xinqi.zq 2018年7月18日 下午3:17:11
 */
public class SkillTraceInfo {

    /**
     * 已执行的action
     */
    private String              executedAction;

    /**
     * 是否是有效的执行，无结果或者失败属于无效的执行
     */
    private Boolean             isValidExecute;

    /**
     * 打点额外附属信息，格式自定义
     */
    private Map<String, String> traceExtendInfo;

    /**
     * @return the executedAction
     */
    public String getExecutedAction() {
        return executedAction;
    }

    /**
     * @param executedAction the executedAction to set
     */
    public void setExecutedAction(String executedAction) {
        this.executedAction = executedAction;
    }

    /**
     * @return the isValidExecute
     */
    public Boolean getIsValidExecute() {
        return isValidExecute;
    }

    /**
     * @param isValidExecute the isValidExecute to set
     */
    public void setIsValidExecute(Boolean isValidExecute) {
        this.isValidExecute = isValidExecute;
    }

    /**
     * @return the traceExtendInfo
     */
    public Map<String, String> getTraceExtendInfo() {
        return traceExtendInfo;
    }

    /**
     * @param traceExtendInfo the traceExtendInfo to set
     */
    public void setTraceExtendInfo(Map<String, String> traceExtendInfo) {
        this.traceExtendInfo = traceExtendInfo;
    }

    /**
     * @param key
     * @param value
     */
    public void addExtendInfo(String key, String value) {
        if (this.traceExtendInfo == null) {
            this.traceExtendInfo = new HashMap<String, String>();
        }
        this.traceExtendInfo.put(key, value);
    }

    @Override
    public String toString() {
        return "SkillTraceInfo [executedAction=" + executedAction + ", isValidExecute="
                + isValidExecute + ", traceExtendInfo=" + traceExtendInfo + "]";
    }

}
