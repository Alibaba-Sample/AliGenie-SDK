package com.alibaba.aligenie.model.request.context.system.user;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 用户信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = User.Builder.class)
public class User {

    /**
     * 天猫精灵用户id，和技能应用的运行链路维度有关
     * 例如：
     * 1、语音技能，只有：设备端-猫精系统端-开发者服务端链路，则不同语音技能，用户id不同；相同语音技能，用户id相同
     * 2、APK应用，假如有：a、设备端-猫精系统端-开发者服务端链路；b、设备端-开发者客户端链路，则a、b链路，用户id不同
     */
    private String userOpenId;

    /**
     * 天猫精灵用户联合id，解决开发者跨技能应用，跨运行链路下同一用户id统一的问题
     * 要使用该字段，开发者需要在平台完成组织申请，并将不同应用或同一应用的不同运行链路的识别标识管理在同一组织下
     * 例如：
     * 1、开发者有多个不同的技能应用，对于同一猫精用户想要实现统一识别
     * 2、开发者一个应用有多条运行链路，对于同一猫精用户需要实现统一识别
     */
    private List<UnionId> userUnionIds;

    /**
     * 用户用于做OAuth 2.0认证的access token,是猫精用户在其他系统中的身份标识令牌
     */
    private String accessToken;

    public static Builder builder() {
        return new Builder();
    }

    private User(Builder builder) {
        this.userOpenId = builder.userOpenId;
        this.userUnionIds = builder.userUnionIds;
        this.accessToken = builder.accessToken;
    }

    public String getUserOpenId() {
        return userOpenId;
    }

    public List<UnionId> getUserUnionIds() {
        return userUnionIds;
    }

    public String getAccessToken() {
        return accessToken;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("userOpenId")
        private String userOpenId;
        @JsonProperty("userUnionIds")
        private List<UnionId> userUnionIds;
        @JsonProperty("accessToken")
        private String accessToken;

        public Builder withUserOpenId(String userOpenId) {
            this.userOpenId = userOpenId;
            return this;
        }

        public Builder withUserUnionIds(List<UnionId> userUnionIds) {
            this.userUnionIds = userUnionIds;
            return this;
        }

        public Builder addUserUnionIds(List<UnionId> userUnionIds) {
            if (userUnionIds != null && userUnionIds.size() > 0) {
                if (this.userUnionIds == null) {
                    this.userUnionIds = new ArrayList<UnionId>();
                }
                this.userUnionIds.addAll(userUnionIds);
            }
            return this;
        }

        public Builder addUserUnionIdItem(UnionId unionId) {
            if (unionId != null) {
                if (this.userUnionIds == null) {
                    this.userUnionIds = new ArrayList<UnionId>();
                }
                this.userUnionIds.add(unionId);
            }
            return this;
        }

        public Builder withAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
