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

/**
 * 业务产生的slot信息
 * 
 * @author xinqi.zq 2019年4月24日 下午2:21:46
 */
public class BizSlotInfo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 生存时间ttl
     */
    private Integer           timeToLive;
    /**
     * 已经历时间
     */
    private Integer           liveTime         = 0;
    /**
     * slot的value，由于不确定是什么类型，只有业务知道，因此尽量不限定类型
     */
    private Object            value;

    /**
     * @param timeToLive
     * @param liveTime
     * @param value
     */
    public BizSlotInfo(Integer timeToLive, Integer liveTime, Object value) {
        this.timeToLive = timeToLive;
        this.liveTime = liveTime;
        this.value = value;
    }

    /**
     * @return the timeToLive
     */
    public Integer getTimeToLive() {
        return timeToLive;
    }

    /**
     * @param timeToLive the timeToLive to set
     */
    public void setTimeToLive(Integer timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * @return the liveTime
     */
    public Integer getLiveTime() {
        return liveTime;
    }

    /**
     * @param liveTime the liveTime to set
     */
    public void setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
    }

    /**
     * @return the value
     */
    public Object getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BizSlotInfo [timeToLive=" + timeToLive + ", liveTime=" + liveTime + ", value="
                + value + "]";
    }

}
