package com.alibaba.aligenie.model.request;

import com.alibaba.aligenie.model.request.requestbody.IntentRequest;
import com.alibaba.aligenie.model.request.requestbody.LaunchRequest;
import com.alibaba.aligenie.model.request.requestbody.SessionEndedRequest;
import com.alibaba.aligenie.model.request.requestbody.event.permission.PermissionGrantedEvent;
import com.alibaba.aligenie.model.request.requestbody.event.permission.PermissionRejectedEvent;
import com.alibaba.aligenie.model.request.requestbody.event.tpl.TplUserEvent;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * 用户request请求的内容
 *
 * @author taixu.zqq
 * @create 8/5/21
 */
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @Type(value = LaunchRequest.class, name = "LaunchRequest"),
    @Type(value = IntentRequest.class, name = "IntentRequest"),
    @Type(value = SessionEndedRequest.class, name = "SessionEndedRequest"),
    @Type(value = TplUserEvent.class, name = "TPL.UserEvent"),
    @Type(value = PermissionGrantedEvent.class, name = "Permission.Granted"),
    @Type(value = PermissionRejectedEvent.class, name = "Permission.Rejected"),
})
public abstract class Request {

    /**
     * 每次请求的唯一标识
     */
    protected String requestId;

    /**
     * request发生的时间，单位是秒，是一个全部是数字的字符串
     */
    protected Long timestamp;

    protected Request(RequestBuilder builder) {
        requestId = builder.requestId;
        timestamp = builder.timestamp;
    }

    public String getRequestId() {
        return requestId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * 通用请求内容构造器
     *
     * @param <T>
     * @param <S>
     */
    public static abstract class RequestBuilder<T extends RequestBuilder, S extends Request> {

        @JsonProperty("requestId")
        private String requestId;
        @JsonProperty("timestamp")
        private Long timestamp;

        public T withRequestId(String requestId) {
            this.requestId = requestId;
            return (T)this;
        }

        public T withTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return (T)this;
        }

        public abstract S build();
    }
}
