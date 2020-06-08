/**
 * Project: semantic-execute-meta
 * 
 * File Created at 2017年4月7日
 * $Id$
 * 
 * Copyright 1999-2100 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.alibaba.da.coin.ide.spi.trans;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.da.coin.ide.spi.enums.ActionKey;
import com.alibaba.da.coin.ide.spi.meta.Action;
import com.alibaba.da.coin.ide.spi.meta.GwCommand;
import com.alibaba.fastjson.JSON;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

/**
 * TODO Comment of Snippet
 * 
 * @author xinqi.zq 2017年4月7日 下午2:03:08
 */
public class GsonUtils {

    public static final Gson gson         = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss")
                                                  .create();

    public static final Gson longDateGson = new GsonBuilder()
                                                  .registerTypeAdapter(Date.class,
                                                          new JsonDeserializer<Date>() {
                                                              @Override
                                                              public Date deserialize(JsonElement json,
                                                                                      Type typeOfT,
                                                                                      JsonDeserializationContext context)
                                                                      throws JsonParseException {
                                                                  return new Date(json
                                                                          .getAsJsonPrimitive()
                                                                          .getAsLong());
                                                              }
                                                          }).setDateFormat(DateFormat.LONG)
                                                  .create();

    /**
     * Action解析专用
     * <p>
     * 注意：这里的 "name" 是指Action里面的name属性， 如有修改请对应修改
     * 
     * @author muhan.xy 2018.1.3
     */
    public static final Gson ACTION_GSON  = new GsonBuilder()
                                                  .setDateFormat("yyyy-MM-dd HH:mm:ss")
                                                  .registerTypeAdapter(
                                                          new TypeToken<List<Action>>() {
                                                          }.getType(),
                                                          new JsonDeserializer<List<Action>>() {
                                                              @Override
                                                              public List<Action> deserialize(JsonElement json,
                                                                                              Type typeOfT,
                                                                                              JsonDeserializationContext context)
                                                                      throws JsonParseException {
                                                                  List list = new ArrayList<Action>();
                                                                  JsonArray ja = json
                                                                          .getAsJsonArray();
                                                                  for (JsonElement je : ja) {
                                                                      // 这里需要兼容不在ActionKey枚举范围内的情况
                                                                      String name = je
                                                                              .getAsJsonObject()
                                                                              .get("name")
                                                                              .getAsString();
                                                                      Type type = Action.class;
                                                                      ActionKey actionKey = ActionKey
                                                                              .getByActionName(name);
                                                                      if (actionKey != null) {
                                                                          type = actionKey
                                                                                  .getType();
                                                                      }
                                                                      list.add(context.deserialize(
                                                                              je, type));
                                                                  }
                                                                  return list;
                                                              }
                                                          }).create();

    public static void main(String[] args) {
        List<GwCommand> gwCommands = new ArrayList<GwCommand>();
        GwCommand gwCommand = new GwCommand("aaa", "bbb");
        gwCommand.putPayload("set", 2.0);
        gwCommand.putPayload("set1", 2);
        gwCommands.add(gwCommand);

        List<Action> actions = new ArrayList<Action>();
        Action action = new Action("action1");
        action.addProperty("p1", "p1");
        action.addProperty("p2", "p2");
        actions.add(action);

        String result = JSON.toJSONString(actions);
        Type type = new TypeToken<List<Action>>() {
        }.getType();
        List<Action> convert = JSON.parseObject(result, type);
        System.out.println(JSON.toJSONString(convert));
    }
}
