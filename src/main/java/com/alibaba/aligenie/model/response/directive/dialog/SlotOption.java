package com.alibaba.aligenie.model.response.directive.dialog;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * slot选择信息
 *
 * @author taixu.zqq
 * @create 8/30/21
 */
@JsonDeserialize(builder = SlotOption.Builder.class)
public class SlotOption {

    /**
     * 待选项的值
     */
    private String value;
    /**
     * 待选项的同义词
     */
    private List<String> synonyms;

    public static Builder builder() {
        return new Builder();
    }

    private SlotOption(Builder builder) {
        this.value = builder.value;
        this.synonyms = builder.synonyms;
    }

    public String getValue() {
        return value;
    }

    public List<String> getSynonyms() {
        return synonyms;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("value")
        private String value;

        @JsonProperty("synonyms")
        private List<String> synonyms;

        public Builder withValue(String value) {
            this.value = value;
            return this;
        }

        public Builder withSynonyms(List<String> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder addSynonyms(List<String> synonyms) {
            if (synonyms != null) {
                if (this.synonyms == null) {
                    this.synonyms = new ArrayList<>();
                }
                this.synonyms.addAll(synonyms);
            }
            return this;
        }

        public Builder addSynonymItem(String synonym) {
            if (synonym != null && synonym.trim().length() > 0) {
                if (this.synonyms == null) {
                    this.synonyms = new ArrayList<>();
                }
                this.synonyms.add(synonym);
            }
            return this;
        }

        public SlotOption build() {
            return new SlotOption(this);
        }
    }
}
