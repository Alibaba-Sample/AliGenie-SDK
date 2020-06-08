/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年6月9日
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
 * TODO Comment of ExecuteCode
 * 
 * @author xinqi.zq 2017年6月9日 上午11:10:51
 */
public enum ExecuteCode {
    /**
     * 执行成功
     */
    SUCCESS,
    /**
     * 请求参数出错，intent理解参数缺失，业务参数缺失
     */
    PARAMS_ERROR,

    /**
     * 执行出错，代码有异常
     */
    EXECUTE_ERROR,

    /**
     * 拼装回复或追问语句出错
     */
    REPLY_ERROR;

}
