package com.alibaba.aligenie.model.request.requestbody.event.permission;

import com.alibaba.aligenie.model.request.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 11/8/21
 */
@JsonDeserialize(builder = PermissionGrantedEvent.Builder.class)
public class PermissionGrantedEvent extends Request {

    private Object payload;

    public static Builder builder() {
        return new Builder();
    }

    private PermissionGrantedEvent(Builder builder) {
        super(builder);
        this.payload = builder.payload;
    }

    public Object getPayload() {
        return payload;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<PermissionGrantedEvent.Builder, PermissionGrantedEvent> {

        @JsonProperty("payload")
        private Object payload;

        public Builder withPayload(Object payload) {
            this.payload = payload;
            return this;
        }

        @Override
        public PermissionGrantedEvent build() {
            return new PermissionGrantedEvent(this);
        }
    }
}
