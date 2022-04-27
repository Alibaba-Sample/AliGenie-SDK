package com.alibaba.aligenie.model.response.directive.dialog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 11/10/21
 */
@JsonDeserialize(builder = ConfirmParaInfo.Builder.class)
public class ConfirmParaInfo {

    /**
     * 表示确认的参数名称。需要在意图中添加这个参数，并配置其关联的实体
     */
    private String confirmParameterName;
    /**
     * 表示否认的参数名称。需要在意图中添加这个参数，并配置其关联的实体
     */
    private String denyParameterName;

    public static Builder builder() {
        return new Builder();
    }

    private ConfirmParaInfo(Builder builder) {
        this.confirmParameterName = builder.confirmParameterName;
        this.denyParameterName = builder.denyParameterName;
    }

    public String getConfirmParameterName() {
        return confirmParameterName;
    }

    public String getDenyParameterName() {
        return denyParameterName;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("confirmParameterName")
        private String confirmParameterName;
        @JsonProperty("denyParameterName")
        private String denyParameterName;

        public Builder withConfirmParameterName(String confirmParameterName) {
            this.confirmParameterName = confirmParameterName;
            return this;
        }

        public Builder withDenyParameterName(String denyParameterName) {
            this.denyParameterName = denyParameterName;
            return this;
        }

        public ConfirmParaInfo build() {
            return new ConfirmParaInfo(this);
        }

    }
}
