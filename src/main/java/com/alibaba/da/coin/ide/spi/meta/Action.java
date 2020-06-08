/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年9月5日
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
 * TODO Comment of Action
 * 
 * @author xinqi.zq 2017年9月5日 上午11:10:12
 */
@Deprecated
public class Action implements Serializable {

    private static final long   serialVersionUID = -6873459683669674098L;

    private String              name;

    private Map<String, String> properties       = new HashMap<String, String>();

    protected Action() {
        super();
    }

    public Action(String name) {
        super();
        this.name = name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the properties
     */
    public Map<String, String> getProperties() {
        return properties;
    }

    public void addProperty(String name, String value) {
        if (properties == null) {
            properties = new HashMap<String, String>();
        }
        properties.put(name, value);

    }

    @Override
    public String toString() {
        return "Action [name=" + name + ", properties=" + properties + "]";
    }

}
