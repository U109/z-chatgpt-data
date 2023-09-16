package com.zzz.zchatgptdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zzz.common.Constants;
import com.zzz.domain.chat.ChatCompletionRequest;
import com.zzz.domain.chat.ChatCompletionResponse;
import com.zzz.domain.chat.Message;
import lombok.extern.slf4j.Slf4j;
import okhttp3.sse.EventSource;
import okhttp3.sse.EventSourceListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import com.zzz.session.OpenAiSession;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class ZChatgptDataApplicationTests {

    @Resource
    private OpenAiSession openAiSession;

    @Test
    void contextLoads() throws Exception {
        // 1. 创建参数
        ChatCompletionRequest chatCompletion = ChatCompletionRequest
                .builder()
                .stream(true)
                .messages(Collections.singletonList(Message.builder().role(Constants.Role.USER).content("写一个java冒泡排序").build()))
                .model(ChatCompletionRequest.Model.GPT_3_5_TURBO.getCode())
                .build();
        // 2. 发起请求
        EventSource eventSource = openAiSession.chatCompletions(chatCompletion, new EventSourceListener() {
            @Override
            public void onEvent(EventSource eventSource, String id, String type, String data) {
                log.info("测试结果：{}", data);
            }
        });
        // 等待
        new CountDownLatch(1).await();
    }

    @Test
    public void test_chat_completions() {
        // 1. 创建参数
        ChatCompletionRequest chatCompletion = ChatCompletionRequest
                .builder()
                .messages(Collections.singletonList(Message.builder().role(Constants.Role.USER).content("写一个java冒泡排序").build()))
                .model(ChatCompletionRequest.Model.GPT_3_5_TURBO.getCode())
                .build();
        // 2. 发起请求
        ChatCompletionResponse chatCompletionResponse = openAiSession.completions(chatCompletion);
        // 3. 解析结果
        chatCompletionResponse.getChoices().forEach(e -> {
            log.info("测试结果：{}", e.getMessage());
        });
    }

}
