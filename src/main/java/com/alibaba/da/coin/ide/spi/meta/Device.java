/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年2月28日
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
 * 设备相关信息
 * 
 * @author xinqi.zq 2019年2月28日 下午3:40:35
 */
public class Device {

    private String       deviceOpenId;

    private List<String> supportedFeatures;

    /**
     * @return the deviceOpenId
     */
    public String getDeviceOpenId() {
        return deviceOpenId;
    }

    /**
     * @param deviceOpenId the deviceOpenId to set
     */
    public void setDeviceOpenId(String deviceOpenId) {
        this.deviceOpenId = deviceOpenId;
    }

    /**
     * @return the supportedFeatures
     */
    public List<String> getSupportedFeatures() {
        return supportedFeatures;
    }

    /**
     * @param supportedFeatures the supportedFeatures to set
     */
    public void setSupportedFeatures(List<String> supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }

}
