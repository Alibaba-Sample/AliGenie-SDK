package com.alibaba.aligenie.model.request.context.system;

import com.alibaba.aligenie.model.request.context.system.application.Application;
import com.alibaba.aligenie.model.request.context.system.device.Device;
import com.alibaba.aligenie.model.request.context.system.user.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 系统信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = System.Builder.class)
public class System {

    /**
     * 技能应用信息
     */
    private Application application;
    /**
     * 用户信息
     */
    private User user;
    /**
     * 设备信息
     */
    private Device device;
    /**
     * 用于访问猫精专用开放API的令牌
     */
    private String apiAccessToken;

    public static Builder builder() {
        return new Builder();
    }

    private System(Builder builder) {
        this.application = builder.application;
        this.user = builder.user;
        this.device = builder.device;
        this.apiAccessToken = builder.apiAccessToken;
    }

    public Application getApplication() {
        return application;
    }

    public User getUser() {
        return user;
    }

    public Device getDevice() {
        return device;
    }

    public String getApiAccessToken() {
        return apiAccessToken;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("application")
        private Application application;
        @JsonProperty("user")
        private User user;
        @JsonProperty("device")
        private Device device;
        @JsonProperty("apiAccessToken")
        private String apiAccessToken;

        public Builder withApplication(Application application) {
            this.application = application;
            return this;
        }

        public Builder withUser(User user) {
            this.user = user;
            return this;
        }

        public Builder withDevice(Device device) {
            this.device = device;
            return this;
        }

        public Builder withApiAccessToken(String apiAccessToken) {
            this.apiAccessToken = apiAccessToken;
            return this;
        }

        public System build() {
            return new System(this);
        }
    }
}
