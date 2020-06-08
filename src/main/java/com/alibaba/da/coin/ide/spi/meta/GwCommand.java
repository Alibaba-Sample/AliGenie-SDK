/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2018年8月8日
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
import java.util.HashMap;
import java.util.Map;

/**
 * 网关定义的播控类command结构
 * 
 * @author xinqi.zq 2018年8月8日 下午2:54:18
 */
public class GwCommand implements Serializable {

    /**
     * 
     */
    private static final long   serialVersionUID = 1L;
    private String              commandDomain;        // 指令命名空间
    private String              commandName;          // 指令名称
    private String              target;               // 指令命名空间
    private Map<String, Object> payload;              // 指令数据

    /**
     * 
     */
    protected GwCommand() {
    }

    /**
     * @param commandDomain
     * @param commandName
     */
    public GwCommand(String commandDomain, String commandName) {
        this.commandDomain = commandDomain;
        this.commandName = commandName;
    }

    /**
     * @param commandDomain
     * @param commandName
     * @param target
     */
    public GwCommand(String commandDomain, String commandName, String target) {
        this.commandDomain = commandDomain;
        this.commandName = commandName;
        this.target = target;
    }

    /**
     * @return the commandDomain
     */
    public String getCommandDomain() {
        return commandDomain;
    }

    /**
     * @param commandDomain the commandDomain to set
     */
    public void setCommandDomain(String commandDomain) {
        this.commandDomain = commandDomain;
    }

    /**
     * @return the commandName
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * @param commandName the commandName to set
     */
    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    /**
     * @return the payload
     */
    public Map<String, Object> getPayload() {
        return payload;
    }

    /**
     * @return the target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target the target to set
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(Map<String, Object> payload) {
        this.payload = payload;
    }

    public void putPayload(String key, Object value) {
        if (this.payload == null) {
            this.payload = new HashMap<String, Object>();
        }
        this.payload.put(key, value);
    }

    @Override
    public String toString() {
        return "GwCommand [commandDomain=" + commandDomain + ", commandName=" + commandName
                + ", target=" + target + ", payload=" + payload + "]";
    }

}
