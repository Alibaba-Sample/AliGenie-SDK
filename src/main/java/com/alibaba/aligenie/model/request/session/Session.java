package com.alibaba.aligenie.model.request.session;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 会话信息
 *
 * @author taixu.zqq
 * @create 8/16/21
 */
@JsonDeserialize(builder = Session.Builder.class)
public class Session {

    /**
     * 当前会话是否为新会话（即与上一个对话是否同在一个技能内）
     */
    private Boolean isNew;
    /**
     * 当前会话的sessionId,唯一标识同一次会话
     */
    private String sessionId;
    /**
     * 同一次会话的信息，当session.new为true时，attributes信息为空。
     * 技能应用可以在response信息中返回attributes，天猫精灵会存储下来，并在本次对话的下一个request中带回给技能应用
     */
    private Map<String, String> attributes;

    public static Builder builder() {
        return new Builder();
    }

    private Session(Builder builder) {
        isNew = builder.isNew;
        sessionId = builder.sessionId;
        attributes = builder.attributes;
    }

    public Boolean isNew() {
        return isNew;
    }

    public String getSessionId() {
        return sessionId;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * 会和内容构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("new")
        private Boolean isNew;
        @JsonProperty("sessionId")
        private String sessionId;
        @JsonProperty("attributes")
        private Map<String, String> attributes;

        public Builder withIsNew(Boolean isNew) {
            this.isNew = isNew;
            return this;
        }

        public Builder withSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public Builder withAttributes(Map<String, String> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder putAttributeItem(String key, String attributeItem) {
            if (key != null && key.trim().length() > 0) {
                if (this.attributes == null) {
                    this.attributes = new HashMap<String, String>();
                }
                this.attributes.put(key, attributeItem);
            }
            return this;
        }

        public Builder putAttributes(Map<String, String> attributes) {
            if (attributes != null && attributes.size() > 0) {
                if (this.attributes == null) {
                    this.attributes = new HashMap<String, String>();
                }
                this.attributes.putAll(attributes);
            }
            return this;
        }

        public Session build() {
            return new Session(this);
        }
    }
}
