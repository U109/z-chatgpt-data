package com.zzz.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zzz.common.Constants;
import com.zzz.domain.dto.ChatProcessAggregate;
import com.zzz.exception.ChatGPTException;
import com.zzz.session.OpenAiSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import javax.annotation.Resource;


/**
 * @author zhangzhongzhen
 */
@Slf4j
public abstract class AbstractChatService implements IChatService {

    @Resource
    protected OpenAiSession openAiSession;

    @Override
    public ResponseBodyEmitter completions(ResponseBodyEmitter emitter, ChatProcessAggregate chatProcess) {
        // 1. 请求应答
        emitter.onCompletion(() -> {
            log.info("流式问答请求完成，使用模型：{}", chatProcess.getModel());
        });
        emitter.onError(throwable -> log.error("流式问答请求疫情，使用模型：{}", chatProcess.getModel(), throwable));

        // 2. 应答处理
        try {
            this.doMessageResponse(chatProcess, emitter);
        } catch (Exception e) {
            throw new ChatGPTException(Constants.ResponseCode.UN_ERROR.getCode(), Constants.ResponseCode.UN_ERROR.getInfo());
        }

        // 3. 返回结果
        return emitter;
    }

    protected abstract void doMessageResponse(ChatProcessAggregate chatProcess, ResponseBodyEmitter responseBodyEmitter) throws JsonProcessingException;

}
