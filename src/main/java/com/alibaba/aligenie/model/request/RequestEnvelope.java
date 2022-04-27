package com.alibaba.aligenie.model.request;

import com.alibaba.aligenie.model.request.context.Context;
import com.alibaba.aligenie.model.request.session.Session;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 发送给开发者技能应用的Request请求
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = RequestEnvelope.Builder.class)
public final class RequestEnvelope {

    /**
     * 协议版本
     */
    private String version;
    /**
     * 会话信息
     */
    private Session session;
    /**
     * 上下文信息
     */
    private Context context;
    /**
     * 请求信息
     */
    private Request request;

    public static Builder builder() {
        return new Builder();
    }

    private RequestEnvelope(Builder builder) {
        this.version = builder.version;
        this.session = builder.session;
        this.context = builder.context;
        this.request = builder.request;
    }

    public String getVersion() {
        return version;
    }

    public Session getSession() {
        return session;
    }

    public Context getContext() {
        return context;
    }

    public Request getRequest() {
        return request;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("version")
        private String version;
        @JsonProperty("session")
        private Session session;
        @JsonProperty("context")
        private Context context;
        @JsonProperty("request")
        private Request request;

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withSession(Session session) {
            this.session = session;
            return this;
        }

        public Builder withContext(Context context) {
            this.context = context;
            return this;
        }

        public Builder withRequest(Request request) {
            this.request = request;
            return this;
        }

        public RequestEnvelope build() {
            return new RequestEnvelope(this);
        }
    }
}
