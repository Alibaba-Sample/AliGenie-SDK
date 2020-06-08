package com.alibaba.da.coin.ide.spi.meta;

public enum ReplyType {
    /**
     * 正常完成交互的阶段并给出模板
     */
    TEMPLATE,
    /**
     * 正常完成交互的阶段并给出语料
     */
    TEXT,
    /**
     * 正常完成交互的阶段并给出SSML
     */
    SSML,
}
