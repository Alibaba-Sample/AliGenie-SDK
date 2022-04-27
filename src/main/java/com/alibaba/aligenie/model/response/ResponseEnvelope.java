package com.alibaba.aligenie.model.response;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 开发者技能应用响应的Response请求
 *
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonDeserialize(builder = ResponseEnvelope.Builder.class)
public final class ResponseEnvelope {

    /**
     * 协议版本
     */
    private String version = "2.0";
    /**
     * 会话临时存储信息
     */
    private Map<String, String> sessionAttributes;
    /**
     * 响应数据
     */
    private Response response;

    public static Builder builder() {
        return new Builder();
    }

    private ResponseEnvelope(Builder builder) {
        this.version = builder.version;
        this.sessionAttributes = builder.sessionAttributes;
        this.response = builder.response;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, String> getSessionAttributes() {
        return sessionAttributes;
    }

    public Response getResponse() {
        return response;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("version")
        private String version = "2.0";
        @JsonProperty("sessionAttributes")
        private Map<String, String> sessionAttributes;
        @JsonProperty("response")
        private Response response;

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withSessionAttributes(Map<String, String> sessionAttributes) {
            this.sessionAttributes = sessionAttributes;
            return this;
        }

        public Builder putSessionAttributeItem(String key, String sessionAttributesItem) {
            if (key != null && key.trim().length() > 0) {
                if (this.sessionAttributes == null) {
                    this.sessionAttributes = new HashMap<String, String>();
                }
                this.sessionAttributes.put(key, sessionAttributesItem);
            }
            return this;
        }

        public Builder putAttributes(Map<String, String> sessionAttributes) {
            if (sessionAttributes != null && sessionAttributes.size() > 0) {
                if (this.sessionAttributes == null) {
                    this.sessionAttributes = new HashMap<String, String>();
                }
                this.sessionAttributes.putAll(sessionAttributes);
            }
            return this;
        }

        public Builder withResponse(Response response) {
            this.response = response;
            return this;
        }

        public ResponseEnvelope build() {
            return new ResponseEnvelope(this);
        }
    }

}
