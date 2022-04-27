package com.alibaba.aligenie.model.response.directive.permission;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.aligenie.model.response.directive.Directive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author taixu.zqq
 * @create 11/5/21
 */
@JsonDeserialize(builder = AskForPermissionsDirective.Builder.class)
public class AskForPermissionsDirective extends Directive {

    /**
     * 要申请的权限名称列表
     */
    private List<String> permissions = new ArrayList<>();

    public static Builder builder() {
        return new Builder();
    }

    private AskForPermissionsDirective(Builder builder) {
        this.permissions = builder.permissions;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Builder {

        @JsonProperty("permissions")
        private List<String> permissions;

        public Builder withPermissions(List<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder addPermissions(List<String> permissions) {
            if (permissions != null) {
                if (this.permissions == null) {
                    this.permissions = new ArrayList<>();
                }
                this.permissions.addAll(permissions);
            }
            return this;
        }

        public Builder addPermissionItem(String permission) {
            if (permission != null && permission.trim().length() > 0) {
                if (this.permissions == null) {
                    this.permissions = new ArrayList<>();
                }
                this.permissions.add(permission);
            }
            return this;
        }

        public AskForPermissionsDirective build() {
            return new AskForPermissionsDirective(this);
        }
    }
}
