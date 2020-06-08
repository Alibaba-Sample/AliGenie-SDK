/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2019年8月13日
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
import java.util.List;

/**
 * TODO Comment of SelectParaInfo
 * 
 * @author xinqi.zq 2019年8月13日 上午10:39:11
 */
public class SelectParaInfo implements Serializable {
    private static final long     serialVersionUID    = 1L;

    /**
     * 用户选择意图参数
     */
    private String                intentParameterName;

    /**
     * 待选择内容选项
     */
    private List<SelectCandidate> candidateList;

    /**
     * 是否匹配待选内容外的参数实体，默认不匹配
     */
    private Boolean               parameterReplyMatch = false;

    /**
     * 是否做第几个匹配，selectIndexMatch=true时，用户选择index超出范围时，也会命中
     */
    private Boolean               selectIndexMatch = false;

    /**
     * @return the intentParameterName
     */
    public String getIntentParameterName() {
        return intentParameterName;
    }

    /**
     * @param intentParameterName the intentParameterName to set
     */
    public void setIntentParameterName(String intentParameterName) {
        this.intentParameterName = intentParameterName;
    }

    /**
     * @return the candidateList
     */
    public List<SelectCandidate> getCandidateList() {
        return candidateList;
    }

    /**
     * @param candidateList the candidateList to set
     */
    public void setCandidateList(List<SelectCandidate> candidateList) {
        this.candidateList = candidateList;
    }

    /**
     * @return the parameterReplyMatch
     */
    public Boolean getParameterReplyMatch() {
        return parameterReplyMatch;
    }

    /**
     * @param parameterReplyMatch the parameterReplyMatch to set
     */
    public void setParameterReplyMatch(Boolean parameterReplyMatch) {
        this.parameterReplyMatch = parameterReplyMatch;
    }

    /**
     * @return the selectIndexMatch
     */
    public Boolean getSelectIndexMatch() {
        return selectIndexMatch;
    }

    /**
     * @param selectIndexMatch the selectIndexMatch to set
     */
    public void setSelectIndexMatch(Boolean selectIndexMatch) {
        this.selectIndexMatch = selectIndexMatch;
    }

    /**
     * 候选项信息
     */
    public static class SelectCandidate implements Serializable {
        private static final long serialVersionUID = 1L;

        /**
         * 候选值
         */
        private String            value;

        /**
         * 候选值同义词
         */
        private List<String>      aliasValues;

        /**
         * 候选归一化值，默认为空
         */
        private String            normValue;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<String> getAliasValues() {
            return aliasValues;
        }

        public void setAliasValues(List<String> aliasValues) {
            this.aliasValues = aliasValues;
        }

        public String getNormValue() {
            return normValue;
        }

        public void setNormValue(String normValue) {
            this.normValue = normValue;
        }
    }
}
