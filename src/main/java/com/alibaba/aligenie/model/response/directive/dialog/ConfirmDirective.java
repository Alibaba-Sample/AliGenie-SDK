package com.alibaba.aligenie.model.response.directive.dialog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * slot确认指令
 *
 * @author taixu.zqq
 * @create 8/30/21
 */
@JsonDeserialize(builder = ConfirmDirective.Builder.class)
public class ConfirmDirective extends DialogDirective {

    private ConfirmParaInfo confirmParaInfo;

    public static Builder builder() {
        return new Builder();
    }

    private ConfirmDirective(Builder builder) {
        super(builder);
        this.confirmParaInfo = builder.confirmParaInfo;
    }

    public ConfirmParaInfo getConfirmParaInfo() {
        return confirmParaInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends DialogDirectiveBuilder<Builder, ConfirmDirective> {

        @JsonProperty("confirmParaInfo")
        private ConfirmParaInfo confirmParaInfo;

        public Builder withConfirmParaInfo(ConfirmParaInfo confirmParaInfo) {
            this.confirmParaInfo = confirmParaInfo;
            return this;
        }

        @Override
        public ConfirmDirective build() {
            return new ConfirmDirective(this);
        }
    }

}
