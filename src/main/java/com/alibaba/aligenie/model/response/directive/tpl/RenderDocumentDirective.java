package com.alibaba.aligenie.model.response.directive.tpl;

import com.alibaba.aligenie.model.response.directive.Directive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * 屏显页面渲染指令
 *
 * @author taixu.zqq
 * @create 9/13/21
 */
@JsonDeserialize(builder = RenderDocumentDirective.Builder.class)
public class RenderDocumentDirective extends Directive {

    /**
     * 页面文档
     */
    private Document document;

    public static Builder builder() {
        return new Builder();
    }

    private RenderDocumentDirective(Builder builder) {
        this.document = builder.document;
    }

    public Document getDocument() {
        return document;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("document")
        private Document document;

        public Builder withDocument(Document document) {
            this.document = document;
            return this;
        }

        public RenderDocumentDirective build() {
            return new RenderDocumentDirective(this);
        }
    }
}
