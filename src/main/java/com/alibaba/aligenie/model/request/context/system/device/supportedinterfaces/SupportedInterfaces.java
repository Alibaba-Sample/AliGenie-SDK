package com.alibaba.aligenie.model.request.context.system.device.supportedinterfaces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 设备支持接口信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = SupportedInterfaces.Builder.class)
public class SupportedInterfaces {

    /**
     * 支持屏幕
     */
    private Screen screen;

    public static Builder builder() {
        return new Builder();
    }

    private SupportedInterfaces(Builder builder) {

        this.screen = builder.screen;
    }

    public Screen getScreen() {
        return screen;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("screen")
        private Screen screen;

        public Builder withScreen(Screen screen) {
            this.screen = screen;
            return this;
        }

        public SupportedInterfaces build() {
            return new SupportedInterfaces(this);
        }
    }
}
