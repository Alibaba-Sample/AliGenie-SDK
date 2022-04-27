package com.alibaba.aligenie.model.response.output;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @Type(value = PlainTextOutputSpeech.class, name = "PlainText"),
    @Type(value = SsmlOutputSpeech.class, name = "SSML"),
    @Type(value = AudioOutputSpeech.class, name = "Audio"),
})
public abstract class OutputSpeech {

    /**
     * 是否打断设备当前播报
     */
    protected Boolean suspend = false;

    protected OutputSpeech(OutputSpeechBuilder builder) {
        suspend = builder.suspend;
    }

    public Boolean getSuspend() {
        return suspend;
    }

    /**
     * @param <T>
     * @param <S>
     */
    public static abstract class OutputSpeechBuilder<T extends OutputSpeechBuilder, S extends OutputSpeech> {

        @JsonProperty("suspend")
        private Boolean suspend = false;

        public T withSuspend(Boolean suspend) {
            this.suspend = suspend;
            return (T)this;
        }

        public abstract S build();
    }
}
