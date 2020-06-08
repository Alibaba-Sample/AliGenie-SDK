/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年8月29日
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
 * 升级安全策略后的请求元数据信息，包含来源，版本、加密方式等
 * 
 * @author xinqi.zq 2017年8月29日 下午5:10:47
 */
public class QueryMetaInfo {
    /**
     * 请求来源标示
     */
    private String source;
    /**
     * 请求版本
     */
    private String queryVersion;
    /**
     * 安全加密方式
     */
    private String securityMode;

    public QueryMetaInfo() {

    }

    public QueryMetaInfo(String source, String queryVersion, String securityMode) {
        super();
        this.source = source;
        this.queryVersion = queryVersion;
        this.securityMode = securityMode;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return the queryVersion
     */
    public String getQueryVersion() {
        return queryVersion;
    }

    /**
     * @param queryVersion the queryVersion to set
     */
    public void setQueryVersion(String queryVersion) {
        this.queryVersion = queryVersion;
    }

    /**
     * @return the securityMode
     */
    public String getSecurityMode() {
        return securityMode;
    }

    /**
     * @param securityMode the securityMode to set
     */
    public void setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
    }

    @Override
    public String toString() {
        return "QueryMetaInfo [source=" + source + ", queryVersion=" + queryVersion
                + ", securityMode=" + securityMode + "]";
    }

}
