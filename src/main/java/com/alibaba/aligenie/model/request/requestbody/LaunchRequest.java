package com.alibaba.aligenie.model.request.requestbody;

import com.alibaba.aligenie.model.request.Request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 用户没有命中特定意图时发起的初始请求
 *
 * @author taixu.zqq
 * @create 8/5/21
 */
@JsonDeserialize(builder = LaunchRequest.Builder.class)
public class LaunchRequest extends Request {

    public static Builder builder() {
        return new Builder();
    }

    private LaunchRequest(Builder builder) {

        super(builder);
    }

    /**
     * LaunchRequest构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<Builder, LaunchRequest> {

        @Override
        public LaunchRequest build() {
            return new LaunchRequest(this);
        }
    }
}
