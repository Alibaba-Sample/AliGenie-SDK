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
import java.util.Map;

/**
 * 请求时附带的技能级别的session信息
 * 
 * @author xinqi.zq 2019年7月17日 下午3:50:22
 */
public class SkillSession implements Serializable {

    /**
     * 
     */
    private static final long   serialVersionUID = 1L;

    private String              skillSessionId;

    /**
     * 是否新的会话session
     */
    private Boolean             newSession;

    /**
     * session属性信息 可存储需要持久化的数据，每次请求都会带上 存储大小有限制
     */
    private Map<String, String> attributes;

    /**
     * @return the skillSessionId
     */
    public String getSkillSessionId() {
        return skillSessionId;
    }

    /**
     * @param skillSessionId the skillSessionId to set
     */
    public void setSkillSessionId(String skillSessionId) {
        this.skillSessionId = skillSessionId;
    }

    /**
     * @return the newSession
     */
    public Boolean getNewSession() {
        return newSession;
    }

    /**
     * @param newSession the newSession to set
     */
    public void setNewSession(Boolean newSession) {
        this.newSession = newSession;
    }

    /**
     * @return the attributes
     */
    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

}
