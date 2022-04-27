package com.alibaba.aligenie.model.request.requestbody.event.permission;

import com.alibaba.aligenie.model.request.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 11/8/21
 */
@JsonDeserialize(builder = PermissionRejectedEvent.Builder.class)
public class PermissionRejectedEvent extends Request {

    public static Builder builder() {
        return new Builder();
    }

    private PermissionRejectedEvent(Builder builder) {
        super(builder);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<PermissionRejectedEvent.Builder, PermissionRejectedEvent> {

        @Override
        public PermissionRejectedEvent build() {
            return new PermissionRejectedEvent(this);
        }
    }
}
