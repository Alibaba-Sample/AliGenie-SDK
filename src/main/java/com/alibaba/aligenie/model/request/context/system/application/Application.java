package com.alibaba.aligenie.model.request.context.system.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 天猫精灵技能应用信息
 *
 * @author taixu.zqq
 * @create 8/17/21
 */
@JsonDeserialize(builder = Application.Builder.class)
public class Application {

    /**
     * 天猫精灵技能应用id
     */
    private Long genieAppId;
    /**
     * 语音交互模型id，兼容历史技能id
     */
    private Long skillId;

    public static Builder builder() {return new Builder();}

    private Application(Builder builder) {
        this.genieAppId = builder.genieAppId;
        this.skillId = builder.skillId;
    }

    public Long getGenieAppId() {
        return genieAppId;
    }

    public Long getSkillId() {
        return skillId;
    }

    /**
     * 天猫精灵应用信息构造器
     */
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("genieAppId")
        private Long genieAppId;
        @JsonProperty("skillId")
        private Long skillId;

        public Builder withGenieAppId(Long genieAppId) {
            this.genieAppId = genieAppId;
            return this;
        }

        public Builder withSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }

        public Application build() {
            return new Application(this);
        }
    }
}
