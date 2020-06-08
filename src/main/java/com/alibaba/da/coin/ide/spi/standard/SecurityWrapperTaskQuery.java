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
package com.alibaba.da.coin.ide.spi.standard;

import com.alibaba.da.coin.ide.spi.meta.QueryMetaInfo;

/**
 * TODO Comment of SecurityWrapperTaskQuery
 * 
 * @author xinqi.zq 2017年8月29日 下午5:07:33
 */
public class SecurityWrapperTaskQuery {

    private QueryMetaInfo queryMetaInfo;

    private String        securityQuery;

    public SecurityWrapperTaskQuery() {

    }

    public SecurityWrapperTaskQuery(QueryMetaInfo queryMetaInfo, String securityQuery) {
        super();
        this.queryMetaInfo = queryMetaInfo;
        this.securityQuery = securityQuery;
    }

    /**
     * @return the queryMetaInfo
     */
    public QueryMetaInfo getQueryMetaInfo() {
        return queryMetaInfo;
    }

    /**
     * @param queryMetaInfo the queryMetaInfo to set
     */
    public void setQueryMetaInfo(QueryMetaInfo queryMetaInfo) {
        this.queryMetaInfo = queryMetaInfo;
    }

    /**
     * @return the securityQuery
     */
    public String getSecurityQuery() {
        return securityQuery;
    }

    /**
     * @param securityQuery the securityQuery to set
     */
    public void setSecurityQuery(String securityQuery) {
        this.securityQuery = securityQuery;
    }

    @Override
    public String toString() {
        return "SecurityWrapperTaskQuery [queryMetaInfo=" + queryMetaInfo + ", securityQuery="
                + securityQuery + "]";
    }

}
