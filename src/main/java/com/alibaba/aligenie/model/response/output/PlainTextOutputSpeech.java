package com.alibaba.aligenie.model.response.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 文本输出，由猫精系统转成音频播放
 *
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonDeserialize(builder = PlainTextOutputSpeech.Builder.class)
public class PlainTextOutputSpeech extends OutputSpeech {

    /**
     * 文本内容
     */
    private String text;

    public static Builder builder() {
        return new Builder();
    }

    private PlainTextOutputSpeech(Builder builder) {
        super(builder);
        this.text = builder.text;
    }

    public String getText() {
        return text;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends OutputSpeechBuilder<Builder, OutputSpeech> {

        @JsonProperty("text")
        private String text;

        public Builder withText(String text) {
            this.text = text;
            return this;
        }

        @Override
        public PlainTextOutputSpeech build() {
            return new PlainTextOutputSpeech(this);
        }
    }
}
