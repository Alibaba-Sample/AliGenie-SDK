/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年7月2日
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
import java.util.List;

/**
 * 跳转到其他意图的逻辑，存在以下几种情况 <br>
 * 《1》直接跳到某个skillId对应的默认意图上 《2》跳转到当前技能内的某个意图 《3》根据模拟的一句完整的自然语言进行识别
 * 
 * @author xinqi.zq 2018年7月2日 下午7:24:27
 */

public class JumpIntent implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 会话转接的类型，来自于上游定义的类型
     */
    private String            transferType;

    /**
     * 技能ID
     */
    private Long              skillId;

    /**
     * 领域ID
     */
    private Long              domainId;

    /**
     * 意图ID
     */
    private Long              intentId;

    /**
     * 意图名
     */
    private String            name;

    /**
     * 跳转到模拟一句具体的自然语言
     */
    private String            mockUtterance;

    /**
     * 跳转时设置的参数信息
     */
    private List<SlotEntity>  slotEntities;

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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the mockUtterance
     */
    public String getMockUtterance() {
        return mockUtterance;
    }

    /**
     * @param mockUtterance the mockUtterance to set
     */
    public void setMockUtterance(String mockUtterance) {
        this.mockUtterance = mockUtterance;
    }

    /**
     * @return the transferType
     */
    public String getTransferType() {
        return transferType;
    }

    /**
     * @param transferType the transferType to set
     */
    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    @Override
    public String toString() {
        return "JumpIntent [transferType=" + transferType + ", skillId=" + skillId + ", domainId="
                + domainId + ", intentId=" + intentId + ", name=" + name + ", mockUtterance="
                + mockUtterance + ", slotEntities=" + slotEntities + "]";
    }

}
