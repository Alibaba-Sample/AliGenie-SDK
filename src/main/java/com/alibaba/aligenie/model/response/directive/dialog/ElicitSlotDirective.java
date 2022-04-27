package com.alibaba.aligenie.model.response.directive.dialog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * slot询问指令
 *
 * @author taixu.zqq
 * @create 8/24/21
 */
@JsonDeserialize(builder = ElicitSlotDirective.Builder.class)
public class ElicitSlotDirective extends DialogDirective {

    /**
     * 需要询问的slot：slot名称
     */
    private String slotToElicit;

    public static Builder builder() {
        return new Builder();
    }

    private ElicitSlotDirective(Builder builder) {
        super(builder);
        this.slotToElicit = builder.slotToElicit;
    }

    public String getSlotToElicit() {
        return slotToElicit;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends DialogDirectiveBuilder<ElicitSlotDirective.Builder, ElicitSlotDirective> {

        @JsonProperty("slotToElicit")
        private String slotToElicit;

        public Builder withSlotToElicit(String slotToElicit) {
            this.slotToElicit = slotToElicit;
            return this;
        }

        @Override
        public ElicitSlotDirective build() {
            return new ElicitSlotDirective(this);
        }
    }
}
