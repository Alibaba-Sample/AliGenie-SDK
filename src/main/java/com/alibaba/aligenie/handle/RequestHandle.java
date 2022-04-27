package com.alibaba.aligenie.handle;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.aligenie.model.request.Request;
import com.alibaba.aligenie.model.request.RequestEnvelope;
import com.alibaba.aligenie.model.request.requestbody.IntentRequest;
import com.alibaba.aligenie.model.request.requestbody.event.permission.PermissionGrantedEvent;
import com.alibaba.aligenie.model.request.requestbody.event.permission.PermissionRejectedEvent;
import com.alibaba.aligenie.model.request.requestbody.event.tpl.TplUserEvent;
import com.alibaba.aligenie.model.response.Response;
import com.alibaba.aligenie.model.response.ResponseEnvelope;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author taixu.zqq
 * @create 3/16/22
 */
public class RequestHandle {

    /**
     * 收到的请求头信息
     */
    protected Map<String, String> header = new HashMap<>();
    /**
     * 收到的request请求体内容
     */
    protected RequestEnvelope requestEnvelope;
    /**
     * 需要返回的response内容体
     */
    protected Response response;

    /**
     * @param request 收到猫精平台的请求体内容
     * @throws IOException
     */
    protected RequestHandle(String request) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        this.requestEnvelope = objectMapper.readValue(request, RequestEnvelope.class);
    }

    /**
     * @param request 收到的猫精平台网络请求内容
     * @throws IOException
     */
    protected RequestHandle(HttpServletRequest request) throws IOException {

        Enumeration<String> headernames = request.getHeaderNames();
        while (headernames.hasMoreElements()) {
            String key = headernames.nextElement();
            String value = request.getHeader(key);
            header.put(key, value);
        }

        StringBuffer stringBuffer = new StringBuffer();
        String line = null;
        BufferedReader bufferedReader = request.getReader();
        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        this.requestEnvelope = objectMapper.readValue(stringBuffer.toString(), RequestEnvelope.class);
    }

    public String run() throws Exception {
        this.dispatch();
        return this.build(response);
    }

    private void dispatch() {
        Request request = requestEnvelope.getRequest();
        if (request instanceof IntentRequest) {
            IntentRequest intentRequest = (IntentRequest)request;
            response = this.handleIntent(intentRequest);
        } else if (request instanceof TplUserEvent) {
            TplUserEvent userEvent = (TplUserEvent)request;
            response = this.handleTplUserEvent(userEvent);
        } else if (request instanceof PermissionGrantedEvent) {
            PermissionGrantedEvent permissionGrantedEvent = (PermissionGrantedEvent)request;
            response = this.handlePermissionGrantedEvent(permissionGrantedEvent);
        } else if (request instanceof PermissionRejectedEvent) {
            PermissionRejectedEvent permissionRejectedEvent = (PermissionRejectedEvent)request;
            response = this.handlePermissionRejectedEvent(permissionRejectedEvent);
        }
    }

    /**
     * 处理IntentRequest请求
     *
     * @param intentRequest
     * @return
     */
    protected Response handleIntent(final IntentRequest intentRequest) {
        return response;
    }

    /**
     * 处理UserEvent请求
     *
     * @param userEvent
     * @return
     */
    protected Response handleTplUserEvent(final TplUserEvent userEvent) {
        return response;
    }

    /**
     * 处理用户拒绝授权事件
     *
     * @param permissionGrantedEvent
     * @return
     */
    protected Response handlePermissionGrantedEvent(final PermissionGrantedEvent permissionGrantedEvent) {
        return response;
    }

    /**
     * 处理用户同意授权事件
     *
     * @param permissionRejectedEvent
     * @return
     */
    protected Response handlePermissionRejectedEvent(final PermissionRejectedEvent permissionRejectedEvent) {
        return response;
    }

    /**
     * 返回响应信息
     *
     * @param response
     * @return
     * @throws JsonProcessingException
     */
    private String build(Response response) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(Include.NON_EMPTY);
        if (response == null) {
            return mapper.writeValueAsString(this.defaultResponse());
        }

        ResponseEnvelope responseEnvelope = ResponseEnvelope.builder()
            .withResponse(response)
            .build();
        return mapper.writeValueAsString(responseEnvelope);

    }

    /**
     * 默认返回
     *
     * @return
     * @throws JsonProcessingException
     */
    private ResponseEnvelope defaultResponse() throws JsonProcessingException {

        return ResponseEnvelope.builder()
            .withResponse(Response.builder().build())
            .build();
    }
}
