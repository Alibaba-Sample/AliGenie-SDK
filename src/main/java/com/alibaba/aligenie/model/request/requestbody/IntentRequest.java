package com.alibaba.aligenie.model.request.requestbody;

import com.alibaba.aligenie.model.request.Request;
import com.alibaba.aligenie.model.request.requestbody.input.Input;
import com.alibaba.aligenie.model.request.requestbody.intent.Intent;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 用户命中特定意图时发起的请求
 *
 * @author taixu.zqq
 * @create 8/9/21
 */
@JsonDeserialize(builder = IntentRequest.Builder.class)
public class IntentRequest extends Request {

    /**
     * 本次请求输入信息
     */
    private Input input;
    /**
     * 意图信息
     */
    private Intent intent;

    public static Builder builder() {
        return new Builder();
    }

    private IntentRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.intent = builder.intent;
    }

    public Input getInput() {
        return input;
    }

    public Intent getIntent() {
        return intent;
    }

    /**
     * IntentRequest构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends RequestBuilder<Builder, IntentRequest> {

        @JsonProperty("input")
        private Input input;
        @JsonProperty("intent")
        private Intent intent;

        public Builder withInput(Input input) {
            this.input = input;
            return this;
        }

        public Builder withIntent(Intent intent) {
            this.intent = intent;
            return this;
        }

        @Override
        public IntentRequest build() {
            return new IntentRequest(this);
        }
    }
}
