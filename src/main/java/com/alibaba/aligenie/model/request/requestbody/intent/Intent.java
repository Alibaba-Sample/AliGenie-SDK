package com.alibaba.aligenie.model.request.requestbody.intent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 意图内容
 *
 * @author taixu.zqq
 * @create 8/13/21
 */
@JsonDeserialize(builder = Intent.Builder.class)
public class Intent {

    /**
     * 意图名称
     */
    private String name;
    /**
     * 意图槽位信息
     */
    private Map<String, Slot> slots;
    /**
     * 当上一轮返回Dialog.SelectSlot指令时，用户选择的索引
     */
    private List<Integer> selectedSlotIndexs;
    /**
     * 意图确认状态
     */
    private ConfirmationStatus confirmationStatus;

    public static Builder builder() {
        return new Builder();
    }

    private Intent(Builder builder) {
        this.name = builder.name;
        this.slots = builder.slots;
        this.selectedSlotIndexs = builder.selectedSlotIndexs;
        this.confirmationStatus = builder.confirmationStatus;
    }

    public String getName() {
        return name;
    }

    public Map<String, Slot> getSlots() {
        return slots;
    }

    public List<Integer> getSelectedSlotIndexs() {
        return selectedSlotIndexs;
    }

    public ConfirmationStatus getConfirmationStatus() {
        return confirmationStatus;
    }

    /**
     * 意图内容构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("name")
        private String name;
        @JsonProperty("slots")
        private Map<String, Slot> slots;
        @JsonProperty("selectedSlotIndexs")
        private List<Integer> selectedSlotIndexs;
        @JsonProperty("confirmationStatus")
        private ConfirmationStatus confirmationStatus;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSlots(Map<String, Slot> slots) {
            this.slots = slots;
            return this;
        }

        public Builder putSlotItem(String key, Slot slotItem) {

            if (key != null && key.trim().length() > 0) {
                if (this.slots == null) {
                    this.slots = new HashMap<String, Slot>();
                }
                this.slots.put(key, slotItem);
            }
            return this;
        }

        public Builder putSlots(Map<String, Slot> slots) {
            if (slots != null && slots.size() > 0) {
                if (this.slots == null) {
                    this.slots = new HashMap<String, Slot>();
                }
                this.slots.putAll(slots);
            }
            return this;
        }

        public Builder withSelectedSlotIndexs(List<Integer> selectedSlotIndexs) {
            this.selectedSlotIndexs = selectedSlotIndexs;
            return this;
        }

        public Builder addSelectedSlotIndexItem(Integer selectedSlotIndex) {
            if (selectedSlotIndex != null) {
                if (this.selectedSlotIndexs == null) {
                    this.selectedSlotIndexs = new ArrayList<>();
                }
                this.selectedSlotIndexs.add(selectedSlotIndex);
            }
            return this;
        }

        public Builder addSelectedSlotIndexs(List<Integer> selectedSlotIndexs) {
            if (selectedSlotIndexs != null && selectedSlotIndexs.size() > 0) {
                if (this.selectedSlotIndexs == null) {
                    this.selectedSlotIndexs = new ArrayList<>();
                }
                this.selectedSlotIndexs.addAll(selectedSlotIndexs);
            }
            return this;
        }

        public Builder withConfirmationStatus(ConfirmationStatus confirmationStatus) {
            this.confirmationStatus = confirmationStatus;
            return this;
        }

        public Intent build() {
            return new Intent(this);
        }
    }

    public enum ConfirmationStatus {

        /**
         * 未确认
         */
        NONE,
        /**
         * 确认
         */
        CONFIRMED,
        /**
         * 拒绝
         */
        DENIED,
        ;
    }

}

