package com.alibaba.aligenie.model.request.requestbody;

import com.alibaba.aligenie.model.request.Request;
import com.alibaba.aligenie.model.request.session.SessionEndedError;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 10/9/21
 */
@JsonDeserialize(builder = SessionEndedRequest.Builder.class)
public class SessionEndedRequest extends Request {

    /**
     * session结束原因
     */
    private SessionEndedReason reason;
    /**
     * session结束错误信息，由于错误结束时才会有
     */
    private SessionEndedError error;

    public static Builder builder() {
        return new Builder();
    }

    private SessionEndedRequest(Builder builder) {
        super(builder);
        this.reason = builder.reason;
        this.error = builder.error;
    }

    public SessionEndedReason getReason() {
        return reason;
    }

    public SessionEndedError getError() {
        return error;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<Builder, SessionEndedRequest> {

        @JsonProperty("reason")
        private SessionEndedReason reason;
        @JsonProperty("error")
        private SessionEndedError error;

        public Builder withReason(SessionEndedReason reason) {
            this.reason = reason;
            return this;
        }

        public Builder withError(SessionEndedError error) {
            this.error = error;
            return this;
        }

        @Override
        public SessionEndedRequest build() {
            return new SessionEndedRequest(this);
        }
    }

    public enum SessionEndedReason {

        /**
         * 用户主动退出
         */
        USER_INITIATED,
        /**
         * 用户无输入或输入无法理解
         */
        EXCEEDED_MAX_REPROMPTS,
        /**
         * 系统错误
         */
        ERROR,
        ;
    }
}
