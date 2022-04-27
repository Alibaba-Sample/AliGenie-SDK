package com.alibaba.aligenie.model.request.requestbody.intent;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 槽位内容
 *
 * @author taixu.zqq
 * @create 8/13/21
 */
@JsonDeserialize(builder = Slot.Builder.class)
public class Slot {

    /**
     * 槽位名称
     */
    private String name;
    /**
     * 槽位值已存在的会话轮数，当前轮值为0，没经历一轮加1
     */
    private Integer liveTime;
    /**
     * 槽位值产生的时间戳
     */
    private Long timestamp;
    /**
     * 槽位值
     */
    private List<String> values;

    public static Builder builder() {
        return new Builder();
    }

    private Slot(Builder builder) {
        this.name = builder.name;
        this.liveTime = builder.liveTime;
        this.timestamp = builder.timestamp;
        this.values = builder.values;
    }

    public String getName() {
        return name;
    }

    public Integer getLiveTime() {
        return liveTime;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public List<String> getValues() {
        return values;
    }

    /**
     * 槽位内容构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {
        @JsonProperty("name")
        private String name;
        @JsonProperty("liveTime")
        private Integer liveTime;
        @JsonProperty("timestamp")
        private Long timestamp;
        @JsonProperty("values")
        private List<String> values;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withLiveTime(Integer liveTime) {
            this.liveTime = liveTime;
            return this;
        }

        public Builder withTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder withValues(List<String> values) {
            this.values = values;
            return this;
        }

        public Builder addValues(List<String> values) {
            if (values != null) {
                if (this.values == null) {
                    this.values = new ArrayList<>();
                }
                values.addAll(values);
            }
            return this;
        }

        public Builder addValueItem(String value) {
            if (value != null && value.trim().length() > 0) {
                if (values == null) {
                    values = new ArrayList<>();
                }
                values.add(value);
            }
            return this;
        }

        /**
         * @return
         */
        public Slot build() {
            return new Slot(this);
        }
    }
}
