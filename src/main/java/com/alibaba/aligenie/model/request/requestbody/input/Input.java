package com.alibaba.aligenie.model.request.requestbody.input;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 3/15/22
 */
@JsonDeserialize(builder = Input.Builder.class)
public class Input {

    /**
     * 输入内容的类型
     */
    private Type type;
    /**
     * 输入内容的值
     */
    private String value;

    public static Builder builder() {
        return new Builder();
    }

    private Input(Builder builder) {
        this.type = builder.type;
        this.value = builder.value;
    }

    public Type getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("type")
        private Type type;
        @JsonProperty("value")
        private String value;

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public Input build() {
            return new Input(this);
        }
    }

    public enum Type {

        /**
         * 文本
         */
        TEXT,
        ;
    }
}
