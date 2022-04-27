package com.alibaba.aligenie.model.response.directive;

import com.alibaba.aligenie.model.response.directive.dialog.ConfirmDirective;
import com.alibaba.aligenie.model.response.directive.dialog.ElicitSlotDirective;
import com.alibaba.aligenie.model.response.directive.dialog.SelectSlotDirective;
import com.alibaba.aligenie.model.response.directive.permission.AskForPermissionsDirective;
import com.alibaba.aligenie.model.response.directive.tpl.RenderDocumentDirective;
import com.alibaba.aligenie.model.response.directive.tpl.UpdateDataSourceDirective;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

/**
 * 指令
 *
 * @author taixu.zqq
 * @create 8/19/21
 */
@JsonTypeInfo(use = Id.NAME, include = As.PROPERTY, property = "type", visible = true)
@JsonSubTypes({
    @Type(value = ElicitSlotDirective.class, name = "Dialog.ElicitSlot"),
    @Type(value = ConfirmDirective.class, name = "Dialog.Confirm"),
    @Type(value = SelectSlotDirective.class, name = "Dialog.SelectSlot"),
    @Type(value = RenderDocumentDirective.class, name = "TPL.RenderDocument"),
    @Type(value = UpdateDataSourceDirective.class, name = "TPL.UpdateDataSource"),
    @Type(value = AskForPermissionsDirective.class, name = "Permission.AskForPermissions"),

})
public abstract class Directive {
}
