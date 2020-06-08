/**
 * Project: coin-ide-share
 * 
 * File Created at 2017年4月5日
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
package com.alibaba.da.coin.ide.spi.standard;

import java.io.Serializable;

/**
 * TODO Comment of Result
 * 
 * @author xinqi.zq 2017年4月5日 上午11:13:42
 */
public class ResultModel<T> implements Serializable {
    private static final long serialVersionUID    = 1L;

    private String            returnCode          = "0"; //0表示调用成功

    private String            returnErrorSolution = ""; //出错时解决办法的描述信息

    private String            returnMessage       = "";  //返回执行的详细信息

    private T                 returnValue;

    public ResultModel() {
        super();
    }

    public ResultModel(T returnValue2) {
        super();
        this.returnValue = returnValue2;
    }

    public ResultModel(String returnCode, String returnErrorSolution, String returnMessage) {
        super();
        this.returnCode = returnCode;
        this.returnErrorSolution = returnErrorSolution;
        this.returnMessage = returnMessage;
    }

    public Boolean isSuccess() {
        return "0".equals(returnCode);
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnErrorSolution() {
        return returnErrorSolution;
    }

    public void setReturnErrorSolution(String returnErrorSolution) {
        this.returnErrorSolution = returnErrorSolution;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public T getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(T returnValue) {
        this.returnValue = returnValue;
    }
}
