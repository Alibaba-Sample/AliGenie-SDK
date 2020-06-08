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
 * Select形式下的scope类型
 * 
 * @author xinqi.zq 2018年7月10日 下午3:40:14
 */
public class SelectScopeType {
    /** 让在domain级别进行选择 */
    public String DOMAIN = "DOMAIN";

    /** 让用户在intent级别进行选择 */
    public String INTENT = "INTENT";

    /** 让用户在slot级别进行选择 */
    public String SLOT   = "slot";
}
