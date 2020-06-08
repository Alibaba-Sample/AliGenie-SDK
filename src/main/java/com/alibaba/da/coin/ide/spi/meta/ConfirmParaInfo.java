/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年7月17日
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
 * TODO Comment of ConfirmParaInfo
 * 
 * @author xinqi.zq 2019年7月17日 上午11:12:26
 */
public class ConfirmParaInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * if user utterance match confirmParameterName,
     * ideRequestData.confirmStatus is CONFIRMED
     */
    private String            confirmParameterName;

    /**
     * if user utterance match denyParameterName, ideRequestData.confirmStatus
     * is DENIED
     */
    private String            denyParameterName;

    public String getConfirmParameterName() {
        return confirmParameterName;
    }

    public void setConfirmParameterName(String confirmParameterName) {
        this.confirmParameterName = confirmParameterName;
    }

    public String getDenyParameterName() {
        return denyParameterName;
    }

    public void setDenyParameterName(String denyParameterName) {
        this.denyParameterName = denyParameterName;
    }
}
