package com.alibaba.aligenie.model.request.context.system.device;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.aligenie.model.request.context.system.device.supportedinterfaces.SupportedInterfaces;
import com.alibaba.aligenie.model.request.context.system.user.UnionId;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 设备信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = Device.Builder.class)
public class Device {

    /**
     * 天猫精灵设备id，和技能应用的运行链路维度有关
     * 例如：
     * 1、语音技能，只有：设备端-猫精系统端-开发者服务端链路，则不同语音技能，设备id不同；相同语音技能，设备id相同
     * 2、APK应用，假如有：a、设备端-猫精系统端-开发者服务端链路；b、设备端-开发者客户端链路，则a、b链路，设备id不同
     */
    private String deviceOpenId;

    /**
     * 天猫精灵设备联合id，解决开发者跨技能应用，跨运行链路下同一设备id统一的问题
     * 要使用该字段，开发者需要在平台完成组织申请，并将不同应用或同一应用的不同运行链路的识别标识管理在同一组织下
     * 例如：
     * 1、开发者有多个不同的技能应用，对于同一设备想要实现统一识别
     * 2、开发者一个应用有多条运行链路，对于同一设备需要实现统一识别
     */
    private List<UnionId> deviceUnionIds;

    /**
     * 设备支持的功能接口，设备特性信息
     */
    private SupportedInterfaces supportedInterfaces;

    /**
     * 扩展信息
     */
    private Map<String, Object> extendInfo;

    public static Builder builder() {
        return new Builder();
    }

    private Device(Builder builder) {
        this.deviceOpenId = builder.deviceOpenId;
        this.deviceUnionIds = builder.deviceUnionIds;
        this.supportedInterfaces = builder.supportedInterfaces;
        this.extendInfo = builder.extendInfo;
    }

    public String getDeviceOpenId() {
        return deviceOpenId;
    }

    public List<UnionId> getDeviceUnionIds() {
        return deviceUnionIds;
    }

    public SupportedInterfaces getSupportedInterfaces() {
        return supportedInterfaces;
    }

    public Map<String, Object> getExtendInfo() {
        return extendInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("deviceOpenId")
        private String deviceOpenId;
        @JsonProperty("deviceUnionIds")
        private List<UnionId> deviceUnionIds;
        @JsonProperty("supportedInterfaces")
        private SupportedInterfaces supportedInterfaces;
        @JsonProperty("extendInfo")
        private Map<String, Object> extendInfo;

        public Builder withDeviceOpenId(String deviceOpenId) {
            this.deviceOpenId = deviceOpenId;
            return this;
        }

        public Builder withDeviceUnionIds(List<UnionId> deviceUnionIds) {
            this.deviceUnionIds = deviceUnionIds;
            return this;
        }

        public Builder addDeviceUnionIds(List<UnionId> deviceUnionIds) {
            if (deviceUnionIds != null && deviceUnionIds.size() > 0) {
                if (this.deviceUnionIds == null) {
                    this.deviceUnionIds = new ArrayList<UnionId>();
                }
                this.deviceUnionIds.addAll(deviceUnionIds);
            }
            return this;
        }

        public Builder addDeviceUnionIdItem(UnionId unionId) {
            if (this.deviceUnionIds == null) {
                this.deviceUnionIds = new ArrayList<UnionId>();
            }
            this.deviceUnionIds.add(unionId);
            return this;
        }

        public Builder withSupportedInterfaces(SupportedInterfaces supportedInterfaces) {
            this.supportedInterfaces = supportedInterfaces;
            return this;
        }

        public Builder withExtendInfo(Map<String, Object> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }

        public Builder putExtendInfoItem(String key, Object extendInfoItem) {
            if (key != null && key.trim().length() > 0) {
                if (this.extendInfo == null) {
                    this.extendInfo = new HashMap<String, Object>();
                }
                this.extendInfo.put(key, extendInfoItem);
            }
            return this;
        }

        public Builder putExtendInfo(Map<String, Object> extendInfo){
            if (extendInfo != null && extendInfo.size() > 0) {
                if (this.extendInfo == null) {
                    this.extendInfo = new HashMap<String, Object>();
                }
                this.extendInfo.putAll(extendInfo);
            }
            return this;
        }

        public Device build() {
            return new Device(this);
        }
    }
}
