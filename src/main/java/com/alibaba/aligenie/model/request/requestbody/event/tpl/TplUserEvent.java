package com.alibaba.aligenie.model.request.requestbody.event.tpl;

import com.alibaba.aligenie.model.request.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 用户操作事件
 *
 * @author taixu.zqq
 * @create 9/16/21
 */
@JsonDeserialize(builder = TplUserEvent.Builder.class)
public class TplUserEvent extends Request {

    private Object payload;

    public static Builder builder() {
        return new Builder();
    }

    private TplUserEvent(Builder builder) {
        super(builder);
        this.payload = builder.payload;
    }

    public Object getPayload() {
        return payload;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<TplUserEvent.Builder, TplUserEvent> {

        @JsonProperty("payload")
        private Object payload;

        public Builder withPayload(Object payload) {
            this.payload = payload;
            return this;
        }

        @Override
        public TplUserEvent build() {
            return new TplUserEvent(this);
        }

    }
}
