package com.zzz.controller;

import com.alibaba.fastjson.JSON;
import com.zzz.domain.dto.ChatProcessAggregate;
import com.zzz.domain.dto.ChatGPTRequestDTO;
import com.zzz.domain.dto.MessageEntity;
import com.zzz.exception.ChatGPTException;
import com.zzz.service.IChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description: chatGpt Api接口服务
 */
@Slf4j
@RestController("api/v1/chatgpt/")
public class ChatGPTAPIServiceController {

    @Resource
    private IChatService chatService;

    @RequestMapping(value = "chat/completions", method = RequestMethod.POST)
    public ResponseBodyEmitter completionsStream(@RequestBody ChatGPTRequestDTO request, HttpServletResponse response) {
        log.info("流式问答请求开始，使用模型：{} 请求信息：{}", request.getModel(), JSON.toJSONString(request.getMessages()));
        try {
            // 1. 基础配置；流式输出、编码、禁用缓存
            response.setContentType("text/event-stream");
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Cache-Control", "no-cache");

            // 2. 构建异步响应对象【对 Token 过期拦截】
            ResponseBodyEmitter emitter = new ResponseBodyEmitter(3 * 60 * 1000L);

            // 3. 构建参数
            ChatProcessAggregate chatProcessAggregate = ChatProcessAggregate.builder()
                    .model(request.getModel())
                    .messages(request.getMessages().stream()
                            .map(entity -> MessageEntity.builder()
                                    .role(entity.getRole())
                                    .content(entity.getContent())
                                    .name(entity.getName())
                                    .build())
                            .collect(Collectors.toList()))
                    .build();

            // 3. 请求结果&返回
            return chatService.completions(emitter, chatProcessAggregate);
        } catch (Exception e) {
            log.error("流式应答，请求模型：{} 发生异常", request.getModel(), e);
            throw new ChatGPTException(e.getMessage());
        }
    }

}
