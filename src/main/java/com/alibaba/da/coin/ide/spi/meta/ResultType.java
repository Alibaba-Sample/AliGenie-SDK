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
 * TODO Comment of ResultType
 * 
 * @author xinqi.zq 2017年4月5日 上午11:06:19
 */
public enum ResultType {
    /**
     * 信息获取，例如"请问从哪个城市出发"
     */
    ASK_INF,

    /**
     * 正常完成交互的阶段并给出回复
     */
    RESULT,

    /**
     * 期待确认
     */
    CONFIRM,

    /**
     * 期待选择
     */
    SELECT,
    /**
     * 触发智能聊天模式
     */
    TOPIC_CONTINUE
}
