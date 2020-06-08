/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年7月10日
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
package com.alibaba.da.coin.ide.spi.cons;

/**
 * confirm形式下的scope类型
 * 
 * @author xinqi.zq 2018年7月10日 下午3:41:32
 */
public class ConfirmScopeType {
    /** 向用户confirm是不是某个领域 */
    public String DOMAIN          = "DOMAIN";

    /** 向用户confirm是不是某个意图 */
    public String INTENT          = "INTENT";

    /** 向用户confirm某个参数的值是不是这个 */
    public String SLOT            = "SLOT";

    /** 向用户confirm是不是切换意图 */
    public String SWITCH_INTENT   = "SWITCH_INTENT";

    /** 向用户confirm是不是恢复对话 */
    public String CONTINUE_INTENT = "CONTINUE_INTENT";
}
