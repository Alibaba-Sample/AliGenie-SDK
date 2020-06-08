/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年3月7日
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
 * 识别到的意图信息，后面复杂的NLU信息都是收拢在这里
 * 
 * @author xinqi.zq 2019年3月7日 下午4:11:01
 */
public class RecIntent {

    private Long             intentId;

    private String           intentName;

    /**
     * 从用户语句中抽取出的slot信息
     */
    private List<SlotEntity> slotEntities = null;

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

    @Override
    public String toString() {
        return "RecIntent [intentId=" + intentId + ", intentName=" + intentName + ", slotEntities="
                + slotEntities + "]";
    }

}
