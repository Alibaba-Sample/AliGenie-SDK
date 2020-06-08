package com.alibaba.da.coin.ide.spi.enums;

import com.alibaba.da.coin.ide.spi.meta.Action;
import com.alibaba.da.coin.ide.spi.meta.CardAction;

/**
 * Action的name对应值枚举
 * @author muhan.xy
 * @since version1.0 2018/1/2
 */
public enum ActionKey {

    AUDIO_ORIGIN("audioPlayOneTime", Action.class),
    AUDIO_ALIGENIE_SOURCE("audioPlayGenieSource", Action.class),
    CARD_ALIGENIE_SOURCE("appCardPush", CardAction.class)

    ;

    private String code;
    private Class<? extends Action> type;

    ActionKey(String code, Class<? extends Action> type) {
        this.code = code;
        this.type = type;
    }

    public String code() {
        return this.code;
    }

    public Class<? extends Action> getType() {
        return type;
    }

    public static ActionKey getByActionName(String code){
        for(ActionKey t : values()){
            if(t.code.equals(code)){
                return t;
            }
        }
        return null;
    }

}
