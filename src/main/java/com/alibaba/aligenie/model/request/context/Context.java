package com.alibaba.aligenie.model.request.context;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.aligenie.model.request.context.system.System;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 请求上下文信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = Context.Builder.class)
public class Context {

    /**
     * 系统信息
     */
    private System system;

    /**
     * 扩展信息
     */
    private Map<String, Object> extendInfo;

    public static Builder builder() {
        return new Builder();
    }

    private Context(Builder builder) {
        this.system = builder.system;
        this.extendInfo = builder.extendInfo;
    }

    public System getSystem() {
        return system;
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("system")
        private System system;
        @JsonProperty("extendInfo")
        private Map<String, Object> extendInfo;

        public Builder withSystem(System system) {
            this.system = system;
            return this;
        }

        public Builder withExtendInfo(Map<String, Object> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }

        public Builder putExtendInfo(Map<String, Object> extendInfo){
            if (extendInfo != null && extendInfo.size() > 0) {
                if (this.extendInfo == null) {
                    this.extendInfo = new HashMap<String, Object>();
                }
                this.extendInfo.putAll(extendInfo);
            }
            return this;
        }

        public Builder putExtendInfoItem(String key, Object extendInfoItem) {
            if (key != null && key.trim().length() > 0) {
                if (this.extendInfo == null) {
                    this.extendInfo = new HashMap<String, Object>();
                }
                this.extendInfo.put(key, extendInfoItem);
            }
            return this;
        }

        public Context build() {
            return new Context(this);
        }
    }
}
