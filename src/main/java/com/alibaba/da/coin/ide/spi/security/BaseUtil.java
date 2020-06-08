/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年8月31日
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
package com.alibaba.da.coin.ide.spi.security;

import org.apache.commons.codec.binary.Base64;

/**
 * TODO Comment of BaseUtil
 * 
 * @author xinqi.zq 2017年8月31日 下午5:35:10
 */
public class BaseUtil {

    private static Base64 base64 = new Base64();

    /**
     * 利用base64将字符串decode为字节数组
     * 
     * @param codeString
     * @return byte[]
     */
    public static byte[] decodeByBase64(String codeString) {
        return base64.decode(codeString.getBytes());

    }

    /**
     * 将byte数组编码为BASE64字符串
     * 
     * @param codeBytes
     * @return
     */
    public static String encodeByBase64(byte[] codeBytes) {
        return new String(base64.encode(codeBytes));
    }
}
