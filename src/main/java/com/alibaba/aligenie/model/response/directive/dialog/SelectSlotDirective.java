package com.alibaba.aligenie.model.response.directive.dialog;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * slot选择指令
 *
 * @author taixu.zqq
 * @create 8/30/21
 */
@JsonDeserialize(builder = SelectSlotDirective.Builder.class)
public class SelectSlotDirective extends DialogDirective {

    /**
     * 需要选择的slot：slot名称
     */
    private String slotToSelect;

    /**
     * 待选项内容
     */
    private List<SlotOption> options;

    /**
     * 是否与配置的实体进行匹配
     */
    private Boolean parameterReplyMatch = false;

    /**
     * 是否运行用户输入的index超过选择个数
     */
    private Boolean selectIndexMatch = false;

    public static Builder builder() {
        return new Builder();
    }

    private SelectSlotDirective(Builder builder) {
        super(builder);
        this.slotToSelect = builder.slotToSelect;
        this.options = builder.options;
        this.parameterReplyMatch = builder.parameterReplyMatch;
        this.selectIndexMatch = builder.selectIndexMatch;
    }

    public String getSlotToSelect() {
        return slotToSelect;
    }

    public List<SlotOption> getOptions() {
        return options;
    }

    public Boolean getParameterReplyMatch() {
        return parameterReplyMatch;
    }

    public Boolean getSelectIndexMatch() {
        return selectIndexMatch;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends DialogDirectiveBuilder<Builder, SelectSlotDirective> {

        @JsonProperty("slotToSelect")
        private String slotToSelect;
        @JsonProperty("options")
        private List<SlotOption> options;
        @JsonProperty("parameterReplyMatch")
        private Boolean parameterReplyMatch = false;
        @JsonProperty("selectIndexMatch")
        private Boolean selectIndexMatch = false;

        public Builder withSlotToSelect(String slotToSelect) {
            this.slotToSelect = slotToSelect;
            return this;
        }

        public Builder withSelectOptions(List<SlotOption> options) {
            this.options = options;
            return this;
        }

        public Builder addSelectOptions(List<SlotOption> options) {
            if (options != null) {
                if (this.options == null) {
                    this.options = new ArrayList<>();
                }
                this.options.addAll(options);
            }
            return this;
        }

        public Builder addSelectOptionItem(SlotOption slotOption) {
            if (slotOption != null) {
                if (this.options == null) {
                    this.options = new ArrayList<>();
                }
                this.options.add(slotOption);
            }
            return this;
        }

        public Builder withParameterReplyMatch(boolean parameterReplyMatch) {
            this.parameterReplyMatch = parameterReplyMatch;
            return this;
        }

        public Builder withSelectIndexMatch(boolean selectIndexMatch) {
            this.selectIndexMatch = selectIndexMatch;
            return this;
        }

        @Override
        public SelectSlotDirective build() {
            return new SelectSlotDirective(this);
        }
    }
}
