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
package com.alibaba.da.coin.ide.spi.meta;

/**
 * TODO Comment of SessionEntry
 * 
 * @author xinqi.zq 2017年4月5日 下午7:57:52
 */
public class SessionEntry {
    /**
     * 生存时间ttl
     */
    private Integer timeToLive;
    /**
     * 已经历时间
     */
    private Integer liveTime = 0;
    /**
     * 产生时间
     */
    private Long    timeStamp;

    /**
     * 具体的值
     */
    private String  value;

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
     * @return the timeStamp
     */
    public Long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

}
