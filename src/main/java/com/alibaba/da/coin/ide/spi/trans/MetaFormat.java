/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年4月6日
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
package com.alibaba.da.coin.ide.spi.trans;

import java.lang.reflect.Type;

import com.alibaba.da.coin.ide.spi.standard.SecurityWrapperTaskQuery;
import com.alibaba.da.coin.ide.spi.standard.TaskQuery;

import com.google.gson.reflect.TypeToken;

/**
 * TODO Comment of MetaFormat
 * 
 * @author xinqi.zq 2017年4月6日 下午7:06:33
 */
public class MetaFormat {
    /**
     * 将post请求的参数转换成TaskQuery
     * 
     * @param requestMetaData
     * @return TaskQuery
     */
    public static TaskQuery parseToQuery(String requestMetaData) {
        Type type = new TypeToken<TaskQuery>() {
        }.getType();
        TaskQuery query = GsonUtils.gson.fromJson(requestMetaData, type);
        return query;
    }

    /**
     * 升级后的请求结构，包含请求元数据信息以及加密后的请求数据，将post请求的参数转换成TaskQuery
     * 
     * @param requestMetaData
     * @return SecurityWrapperTaskQuery
     */
    public static SecurityWrapperTaskQuery parseToWrapperQuery(String requestMetaData) {
        Type type = new TypeToken<SecurityWrapperTaskQuery>() {
        }.getType();
        SecurityWrapperTaskQuery wapperQuery = GsonUtils.gson.fromJson(requestMetaData, type);
        return wapperQuery;
    }
}
