/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年4月24日
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

import java.io.Serializable;
import java.util.Map;

import com.google.common.collect.Maps;

/**
 * 技能执行回传给上游的信息
 * 
 * @author xinqi.zq 2019年4月24日 下午2:19:05
 */
public class SkillPostBizInfo implements Serializable {

    private static final long        serialVersionUID    = 1L;

    /**
     * 默认定义成功的执行码，如果技能需要告知成功标志，可以将该值设置为bizCode
     */
    private static final String      DEFAULT_SUCCESS_TAG = "SUCCESS";

    /**
     * 技能业务执行希望暴露给上游的业务执行信息
     */
    private String                   bizMsg;

    /**
     * 技能业务希望暴露给上游的执行码，该字段需要技能主动设置<br>
     * 具体错误码需要各技能自己定义
     */
    private String                   bizCode;

    /**
     * 技能自定义code，完全由技能自由填充
     */
    private String                   bizSelfDefineCode;

    private Map<String, Object>      bizAttrs            = Maps.newHashMap();
    /**
     * 业务产生回传的类似于slot的信息
     */
    private Map<String, BizSlotInfo> bizSlots            = Maps.newHashMap();

    public SkillPostBizInfo() {
    }

    /**
     * @return the bizSlots
     */
    public Map<String, BizSlotInfo> getBizSlots() {
        return bizSlots;
    }

    /**
     * @param bizSlots the bizSlots to set
     */
    public void setBizSlots(Map<String, BizSlotInfo> bizSlots) {
        this.bizSlots = bizSlots;
    }

    /**
     * @return the bizMsg
     */
    public String getBizMsg() {
        return bizMsg;
    }

    /**
     * @param bizMsg the bizMsg to set
     */
    public void setBizMsg(String bizMsg) {
        this.bizMsg = bizMsg;
    }

    /**
     * @return the bizCode
     */
    public String getBizCode() {
        return bizCode;
    }

    /**
     * @param bizCode the bizCode to set
     */
    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    /**
     * @return the bizSelfDefineCode
     */
    public String getBizSelfDefineCode() {
        return bizSelfDefineCode;
    }

    /**
     * @param bizSelfDefineCode the bizSelfDefineCode to set
     */
    public void setBizSelfDefineCode(String bizSelfDefineCode) {
        this.bizSelfDefineCode = bizSelfDefineCode;
    }

    /**
     * @return the bizAttrs
     */
    public Map<String, Object> getBizAttrs() {
        return bizAttrs;
    }

    /**
     * @param bizAttrs the bizAttrs to set
     */
    public void setBizAttrs(Map<String, Object> bizAttrs) {
        this.bizAttrs = bizAttrs;
    }

    @Override
    public String toString() {
        return "SkillPostBizInfo [bizMsg=" + bizMsg + ", bizCode=" + bizCode
                + ", bizSelfDefineCode=" + bizSelfDefineCode + ", bizAttrs=" + bizAttrs
                + ", bizSlots=" + bizSlots + "]";
    }

}
