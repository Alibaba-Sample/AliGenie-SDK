package com.alibaba.aligenie.model.request.session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 10/9/21
 */
@JsonDeserialize(builder = SessionEndedError.Builder.class)
public class SessionEndedError {

    /**
     * 错误类型
     */
    private Type type;
    /**
     * 错误描述信息
     */
    private String message;

    public static Builder builder() {
        return new Builder();
    }

    private SessionEndedError(Builder builder) {
        this.type = builder.type;
        this.message = builder.message;
    }

    public Type getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("type")
        private Type type;
        @JsonProperty("message")
        private String message;

        public Builder withType(Type type) {
            this.type = type;
            return this;
        }

        public Builder withMessage(String message) {
            this.message = message;
            return this;
        }

        public SessionEndedError build() {
            return new SessionEndedError(this);
        }
    }

    public enum Type {
        /**
         * 无效的响应
         */
        INVALID_RESPONSE,
        /**
         * 设备通信异常
         */
        DEVICE_COMMUNICATION_ERROR,
        /**
         * 其他系统错误
         */
        INTERNAL_ERROR;
    }
}
