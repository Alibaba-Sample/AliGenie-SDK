package com.alibaba.aligenie.model.response.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * SSML输出
 *
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonDeserialize(builder = SsmlOutputSpeech.Builder.class)
public class SsmlOutputSpeech extends OutputSpeech {

    /**
     * ssml内容
     */
    private String ssml;

    public static Builder builder() {
        return new Builder();
    }

    private SsmlOutputSpeech(Builder builder) {
        super(builder);
        this.ssml = builder.ssml;
    }

    public String getSsml() {
        return ssml;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends OutputSpeechBuilder<Builder, OutputSpeech> {

        @JsonProperty("ssml")
        private String ssml;

        public Builder withSsml(String ssml) {
            this.ssml = ssml;
            return this;
        }

        @Override
        public SsmlOutputSpeech build() {
            return new SsmlOutputSpeech(this);
        }
    }
}
