package com.alibaba.aligenie.samples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.aligenie.handle.RequestHandle;
import com.alibaba.aligenie.model.request.requestbody.IntentRequest;
import com.alibaba.aligenie.model.request.requestbody.intent.Intent;
import com.alibaba.aligenie.model.request.requestbody.intent.Slot;
import com.alibaba.aligenie.model.response.Response;
import com.alibaba.aligenie.model.response.directive.Directive;
import com.alibaba.aligenie.model.response.directive.dialog.ElicitSlotDirective;
import com.alibaba.aligenie.model.response.output.OutputSpeech;
import com.alibaba.aligenie.model.response.output.PlainTextOutputSpeech;

/**
 * 天气服务
 *
 * @author taixu.zqq
 * @create 3/24/22
 */
public class WeatherService extends RequestHandle {

    /**
     * @param request
     * @throws IOException
     */
    public WeatherService(String request) throws IOException {
        super(request);
    }

    @Override
    public Response handleIntent(final IntentRequest request) {
        Intent intent = request.getIntent();
        // 判断意图名称是否匹配，这里进入默认欢迎意图
        if (intent.getName().equals("welcome")) {
            return welcomeAction(request);
        } else {
            // 其他意图处理
        }
        // 其他处理
        return null;
    }

    /**
     * 欢迎意图服务
     *
     * @param request
     * @return
     */
    private Response welcomeAction(IntentRequest request) {
        Response.Builder responseBuilder = Response.builder();

        Intent intent = request.getIntent();
        Map<String, Slot> slots = intent.getSlots();

        if (!slots.containsKey("city")) {
            // 没有获取到city参数，进行slot询问
            return ask("city", "请问是哪个城市");
        }

        // 获取城市名
        String city = slots.get("city").getValues().get(0);
        // 获取时间(这里假定在平台配置了时间有默认值，一定会存在)
        String date = slots.get("sys.date(公共实体)").getValues().get(0);

        // 播报语料
        String text = String.format("%s %s 天气晴", city, date);
        PlainTextOutputSpeech.Builder plainTextOutputBuilder = PlainTextOutputSpeech.builder();
        plainTextOutputBuilder.withText(text);

        List<OutputSpeech> outputSpeeches = new ArrayList() {{
            add(plainTextOutputBuilder.build());
        }};

        return Response.builder()
            .withOutputSpeechs(outputSpeeches)
            .build();
    }

    private Response ask(String slot, String text) {

        // 询问语料
        PlainTextOutputSpeech.Builder plainTextOutputBuilder = PlainTextOutputSpeech.builder();
        plainTextOutputBuilder.withText(text);
        List<OutputSpeech> outputSpeeches = new ArrayList() {{
            add(plainTextOutputBuilder.build());
        }};

        // 询问指令
        ElicitSlotDirective.Builder elicitSlotDirectiveBuilder = ElicitSlotDirective.builder();
        elicitSlotDirectiveBuilder.withSlotToElicit(slot);
        List<Directive> directives = new ArrayList() {{
            add(elicitSlotDirectiveBuilder.build());
        }};

        return Response.builder()
            .withShouldEndSession(false)
            .withExpectSpeech(true)
            .withOutputSpeechs(outputSpeeches)
            .withDirectives(directives)
            .build();
    }
}
