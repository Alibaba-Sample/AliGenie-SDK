/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年5月30日
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

import java.util.HashMap;
import java.util.Map;

/**
 * 技能对话session级别信息，由技能自身填充，响应时返回给对话影响
 * 
 * @author xinqi.zq 2019年5月30日 下午3:00:03
 */
public class SkillDialogSession {

    private boolean             skillEndNluSession = false;

    private Map<String, String> sessionAttrs       = new HashMap<String, String>();

    /**
     * @return the sessionAttrs
     */
    public Map<String, String> getSessionAttrs() {
        return sessionAttrs;
    }

    /**
     * @param sessionAttrs the sessionAttrs to set
     */
    public void setSessionAttrs(Map<String, String> sessionAttrs) {
        this.sessionAttrs = sessionAttrs;
    }

    /**
     * @return the skillEndNluSession
     */
    public boolean isSkillEndNluSession() {
        return skillEndNluSession;
    }

    /**
     * @param skillEndNluSession the skillEndNluSession to set
     */
    public void setSkillEndNluSession(boolean skillEndNluSession) {
        this.skillEndNluSession = skillEndNluSession;
    }

}
