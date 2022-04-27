package com.alibaba.aligenie.model.request.context.system.device.supportedinterfaces;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 支持屏幕
 *
 * @author taixu.zqq
 * @create 9/14/21
 */
@JsonDeserialize(builder = Screen.Builder.class)
public class Screen {

    public static Builder builder() {
        return new Screen.Builder();
    }

    private Screen(Builder builder) {

    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        public Screen build() {
            return new Screen(this);
        }
    }
}
