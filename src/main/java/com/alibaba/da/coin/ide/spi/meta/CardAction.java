package com.alibaba.da.coin.ide.spi.meta;

import java.util.List;

import com.alibaba.da.coin.ide.spi.enums.ActionKey;

/**
 * 卡片Action
 * @author muhan.xy
 * @since version1.0 2018/1/2
 */
public class CardAction extends Action{

    private static final long serialVersionUID = -4630770713547370025L;

    private String commandName;

    private List<CardActionField> fieldMappings;

    public CardAction(String name) {
        super(name);
    }

    public CardAction(){
        super(ActionKey.CARD_ALIGENIE_SOURCE.code());
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public List<CardActionField> getFieldMappings() {
        return fieldMappings;
    }

    public void setFieldMappings(List<CardActionField> fieldMappings) {
        this.fieldMappings = fieldMappings;
    }
}
