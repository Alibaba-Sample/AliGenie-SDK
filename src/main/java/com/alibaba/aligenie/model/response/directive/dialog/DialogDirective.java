package com.alibaba.aligenie.model.response.directive.dialog;

import com.alibaba.aligenie.model.response.directive.Directive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 对话指令
 *
 * @author taixu.zqq
 * @create 8/24/21
 */

public abstract class DialogDirective extends Directive {


    protected DialogDirective(DialogDirectiveBuilder builder) {
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static abstract class DialogDirectiveBuilder<T extends DialogDirectiveBuilder, S extends DialogDirective> {

        public abstract S build();
    }
}
