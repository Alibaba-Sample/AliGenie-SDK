package com.alibaba.aligenie.model.request.context.system.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * unionId内容
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = UnionId.Builder.class)
public class UnionId {

    /**
     * 组织id，开发者需要在平台申请
     */
    private String organizationId;
    /**
     * 跨应用、跨链路统一标识id
     */
    private String unionId;

    public static Builder builder() {
        return new Builder();
    }

    private UnionId(Builder builder) {
        this.organizationId = builder.organizationId;
        this.unionId = builder.unionId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getUnionId() {
        return unionId;
    }

    /**
     * unionId内容构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("organizationId")
        private String organizationId;
        @JsonProperty("unionId")
        private String unionId;

        public Builder withOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        public Builder withUnionId(String unionId) {
            this.unionId = unionId;
            return this;
        }

        public UnionId build() {
            return new UnionId(this);
        }
    }
}
