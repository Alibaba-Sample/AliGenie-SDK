package com.alibaba.da.coin.ide.spi.meta;

import java.io.Serializable;

/**
 * 卡片Action的属性
 * @author muhan.xy
 * @since version1.0 2018/1/2
 */
public class CardActionField implements Serializable{

    private static final long serialVersionUID = 1077319957816724251L;

    private String actionFieldName;

    private String cmdFieldName;

    private String cmdFieldType;

    private String cmdFieldValue;

    private Boolean required;

    public String getActionFieldName() {
        return actionFieldName;
    }

    public void setActionFieldName(String actionFieldName) {
        this.actionFieldName = actionFieldName;
    }

    public String getCmdFieldName() {
        return cmdFieldName;
    }

    public void setCmdFieldName(String cmdFieldName) {
        this.cmdFieldName = cmdFieldName;
    }

    public String getCmdFieldType() {
        return cmdFieldType;
    }

    public void setCmdFieldType(String cmdFieldType) {
        this.cmdFieldType = cmdFieldType;
    }

    public String getCmdFieldValue() {
        return cmdFieldValue;
    }

    public void setCmdFieldValue(String cmdFieldValue) {
        this.cmdFieldValue = cmdFieldValue;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }
}
