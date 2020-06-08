/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年7月3日
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
import java.util.Map;

/**
 * 追问时的参数信息，必须设置，当发起Ask_info时就需要设置的追问信息,可以附带select或者confirm额外数据
 * 
 * @author xinqi.zq 2017年7月3日 上午11:39:31
 */
public class AskedInfoMsg implements Serializable {
    /**
     * 
     */
    private static final long   serialVersionUID = 1L;
    private String              parameterName;
    private Long                intentId;

    /** select状态的类型，只能用com.alibaba.da.coin.ide.spi.cons.SelectScopeType中的定义。 */
    private String              selectExpectType;

    /**
     * 只在ReplyType为select 时生效 期待的信息的候选，为select状态提供问句解析的参考。候选信息可能是多个，用list存储<br>
     * 每个候选信息包括两个部分，原始信息和标准信息，使用数组存储，长度为2，位置0存储原始信息，位置1存储标准信息。<br>
     * <br>
     * 比如问用户：你想听音乐还是看视频呢？<br>
     * candidatesInfo为：[["音乐", 97L], ["视频", 90L]]，其中标准信息为domain ID<br>
     * 此时，expectType的值应为 DOMAIN，代表在domain粒度主动询问用户。<br>
     * <br>
     * 再如，问用户：你喜欢蓝色的还是紫色的？<br>
     * candidatesInfo为：[["蓝色", "蓝色"], ["紫色", "紫色"]]，其中标准信息为归一化之后的颜色值，可能与原始值相同<br>
     * 此时，expectType的值应为 SLOT，代表在slot粒度主动询问用户。<br>
     * <br>
     * 再如，问用户：你想查电话号码还是直接预订这家餐厅？<br>
     * candidatesInfo为：[["查号码", "query_contact"], ["预订", "order"]]，其中标准信息为intent
     * 名称<br>
     * 此时，expectType的值应为 INTENT，代表在intent粒度主动询问用户。<br>
     */
    private List<Object[]>      candidatesInfo;

    /** confirm状态的类型，只能用com.alibaba.da.coin.ide.spi.cons.ConfirmScopeType中的定义。 */
    private String              confirmExpectType;

    /**
     * 存储confirm时的context，比如confirm是不是某个领域的时候，数据结构如下：
     * 
     * <pre>
     * {"domainId":100}
     * </pre>
     * 
     * 比如confirm是不是某个slot的值的时候，数据结构如下:
     * 
     * <pre>
     * {"slotName":"time", "slotValue":"今天"}
     * </pre>
     */
    private Map<String, Object> confirmContext;

    public AskedInfoMsg() {
        super();
    }

    public AskedInfoMsg(String parameterName, Long intentId) {
        super();
        this.parameterName = parameterName;
        this.intentId = intentId;
    }

    /**
     * @return the parameterName
     */
    public String getParameterName() {
        return parameterName;
    }

    /**
     * @param parameterName the parameterName to set
     */
    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /**
     * @return the intentId
     */
    public Long getIntentId() {
        return intentId;
    }

    /**
     * @param intentId the intentId to set
     */
    public void setIntentId(Long intentId) {
        this.intentId = intentId;
    }

    /**
     * @return the selectExpectType
     */
    public String getSelectExpectType() {
        return selectExpectType;
    }

    /**
     * @param selectExpectType the selectExpectType to set
     */
    public void setSelectExpectType(String selectExpectType) {
        this.selectExpectType = selectExpectType;
    }

    /**
     * @return the candidatesInfo
     */
    public List<Object[]> getCandidatesInfo() {
        return candidatesInfo;
    }

    /**
     * @param candidatesInfo the candidatesInfo to set
     */
    public void setCandidatesInfo(List<Object[]> candidatesInfo) {
        this.candidatesInfo = candidatesInfo;
    }

    /**
     * @return the confirmExpectType
     */
    public String getConfirmExpectType() {
        return confirmExpectType;
    }

    /**
     * @param confirmExpectType the confirmExpectType to set
     */
    public void setConfirmExpectType(String confirmExpectType) {
        this.confirmExpectType = confirmExpectType;
    }

    /**
     * @return the confirmContext
     */
    public Map<String, Object> getConfirmContext() {
        return confirmContext;
    }

    /**
     * @param confirmContext the confirmContext to set
     */
    public void setConfirmContext(Map<String, Object> confirmContext) {
        this.confirmContext = confirmContext;
    }

    @Override
    public String toString() {
        return "AskedInfoMsg [parameterName=" + parameterName + ", intentId=" + intentId
                + ", selectExpectType=" + selectExpectType + ", candidatesInfo=" + candidatesInfo
                + ", confirmExpectType=" + confirmExpectType + ", confirmContext=" + confirmContext
                + "]";
    }

}
