package com.alibaba.aligenie.model.response.output;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 音频输出
 *
 * @author taixu.zqq
 * @create 9/7/21
 */
@JsonDeserialize(builder = AudioOutputSpeech.Builder.class)
public class AudioOutputSpeech extends OutputSpeech {

    /**
     * 音频id，音频文件上传到平台后生成的唯一标识
     */
    private String audioId;

    public static Builder builder() {
        return new Builder();
    }

    private AudioOutputSpeech(Builder builder) {

        super(builder);
        this.audioId = builder.audioId;
    }

    public String getAudioId() {
        return audioId;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder extends OutputSpeechBuilder<Builder, OutputSpeech> {

        @JsonProperty("audioId")
        private String audioId;

        public Builder withAudioId(String audioId) {
            this.audioId = audioId;
            return this;
        }

        @Override
        public AudioOutputSpeech build() {
            return new AudioOutputSpeech(this);
        }
    }
}
