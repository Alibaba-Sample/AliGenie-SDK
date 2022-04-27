package com.alibaba.aligenie.model.response.directive.tpl;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.aligenie.model.response.directive.Directive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 9/17/21
 */
@JsonDeserialize(builder = UpdateDataSourceDirective.Builder.class)
public class UpdateDataSourceDirective extends Directive {

    /**
     * 需要更新的数据
     */
    private Map<String, Object> dataSource;

    public static Builder builder() {
        return new Builder();
    }

    private UpdateDataSourceDirective(Builder builder) {
        this.dataSource = builder.dataSource;
    }

    public Map<String, Object> getDataSource() {
        return dataSource;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("dataSource")
        private Map<String, Object> dataSource;

        public Builder withDataSource(Map<String, Object> dataSources) {
            this.dataSource = dataSources;
            return this;
        }

        public Builder putDataSource(Map<String, Object> dataSources) {
            if (dataSources != null) {
                if (this.dataSource == null) {
                    this.dataSource = new HashMap<>();
                }
                this.dataSource.putAll(dataSources);
            }
            return this;
        }

        public Builder putDataSourceItem(String key, Object value) {
            if (key != null && key.trim().length() > 0) {
                if (dataSource == null) {
                    dataSource = new HashMap<>();
                }
                dataSource.put(key, value);
            }
            return this;
        }

        public UpdateDataSourceDirective build() {
            return new UpdateDataSourceDirective(this);
        }
    }
}

