package com.alibaba.aligenie.model.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.aligenie.model.response.directive.Directive;
import com.alibaba.aligenie.model.response.output.OutputSpeech;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 技能应用response响应的内容
 *
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonDeserialize(builder = Response.Builder.class)
public final class Response {

    /**
     * 需要播放的语音信息列表
     */
    private List<OutputSpeech> outputSpeechs;

    /**
     * 技能应用输出的指令
     */
    private List<Directive> directives;

    /**
     * 会话结束标识
     */
    private Boolean shouldEndSession = true;

    /**
     * 是否开麦
     */
    private Boolean expectSpeech = false;

    /**
     * 扩展信息
     * needLight：true/false，开麦是否需要灯光提示标识
     * needVoice：true/false，开麦是否需要声音提示标识
     */
    private Map<String, Object> extInfo;

    public static Builder builder() {
        return new Builder();
    }

    private Response(Builder builder) {

        this.outputSpeechs = builder.outputSpeechs;
        this.directives = builder.directives;
        this.shouldEndSession = builder.shouldEndSession;
        this.expectSpeech = builder.expectSpeech;
        this.extInfo = builder.extInfo;
    }

    public List<OutputSpeech> getOutputSpeechs() {
        return outputSpeechs;
    }

    public List<Directive> getDirectives() {
        return directives;
    }

    public Boolean getShouldEndSession() {
        return shouldEndSession;
    }

    public Boolean getExpectSpeech() {
        return expectSpeech;
    }

    public Map<String, Object> getExtInfo() {
        return extInfo;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("outputSpeechs")
        private List<OutputSpeech> outputSpeechs;
        @JsonProperty("directives")
        private List<Directive> directives;
        @JsonProperty("shouldEndSession")
        private Boolean shouldEndSession = true;
        @JsonProperty("expectSpeech")
        private Boolean expectSpeech = false;
        @JsonProperty("extInfo")
        private Map<String, Object> extInfo;

        public Builder withOutputSpeechs(List<OutputSpeech> outputSpeechs) {
            this.outputSpeechs = outputSpeechs;
            return this;
        }

        public Builder addOutputSpeechs(List<OutputSpeech> outputSpeechs) {
            if (outputSpeechs != null) {
                if (this.outputSpeechs == null) {
                    this.outputSpeechs = new ArrayList<>();
                }
                this.outputSpeechs.addAll(outputSpeechs);
            }
            return this;
        }

        public Builder addOutputSpeechItem(OutputSpeech outputSpeech) {
            if (outputSpeech != null) {
                if (this.outputSpeechs == null) {
                    this.outputSpeechs = new ArrayList<>();
                }
                this.outputSpeechs.add(outputSpeech);
            }
            return this;
        }

        public Builder withDirectives(List<Directive> directives) {
            this.directives = directives;
            return this;
        }

        public Builder addDirectives(List<Directive> directives) {
            if (directives != null) {
                if(this.directives == null) {
                    this.directives = new ArrayList<>();
                }
                this.directives.addAll(directives);
            }
            return this;
        }

        public Builder addDirectiveItem(Directive directive) {
            if (directive != null) {
                if(this.directives == null) {
                    this.directives = new ArrayList<>();
                }
                this.directives.add(directive);
            }
            return this;
        }

        public Builder withShouldEndSession(Boolean shouldEndSession) {
            this.shouldEndSession = shouldEndSession;
            return this;
        }

        public Builder withExpectSpeech(Boolean expectSpeech) {
            this.expectSpeech = expectSpeech;
            return this;
        }

        public Builder withExtInfo(Map<String, Object> extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        public Builder putExtInfo(Map<String, Object> extInfo) {
            if (extInfo != null) {
                if (this.extInfo == null) {
                    this.extInfo = new HashMap<>();
                }
                this.extInfo.putAll(extInfo);
            }
            return this;
        }

        public Builder putExtInfoItem(String key, Object value) {
            if (key != null && key.trim().length() > 0) {
                if (this.extInfo == null) {
                    this.extInfo = new HashMap<>();
                }
                this.extInfo.put(key, value);
            }
            return this;
        }

        public Response build() {
            return new Response(this);
        }
    }
}
