package com.alibaba.aligenie.model.response.directive.tpl;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 页面文档
 *
 * @author taixu.zqq
 * @create 9/14/21
 */
@JsonDeserialize(builder = Document.Builder.class)
public class Document {

    /**
     * 页面类型
     */
    private PageType pageType;

    /**
     * 页面数据
     */
    private Map<String, Object> data;

    public static Builder builder() {
        return new Builder();
    }

    private Document(Builder builder) {
        this.pageType = builder.pageType;
        this.data = builder.data;
    }

    public PageType getPageType() {
        return pageType;
    }

    public Map<String, Object> getData() {
        return data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("pageType")
        private PageType pageType;
        @JsonProperty("data")
        private Map<String, Object> data;

        public Builder withPageType(PageType pageType) {
            this.pageType = pageType;
            return this;
        }


        public Builder withData(Map<String, Object> data) {
            this.data = data;
            return this;
        }

        public Builder putData(Map<String, Object> data) {
            if (data != null) {
                if (this.data == null) {
                    this.data = new HashMap<>();
                }
                this.data.putAll(data);
            }
            return this;
        }

        public Builder putDataItem(String key, Object value) {
            if (key != null && key.trim().length() > 0) {
                if (this.data == null) {
                    this.data = new HashMap<>();
                }
                this.data.put(key, value);
            }
            return this;
        }

        public Document build() {
            return new Document(this);
        }
    }

    public enum PageType {

        /**
         * 弹窗渲染
         */
        @JsonProperty("AliGenie.Card")
        Card,
        /**
         * 全屏渲染
         */
        @JsonProperty("AliGenie.Page")
        Page,
        ;
    }

}
