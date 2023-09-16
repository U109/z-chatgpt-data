package com.zzz.service;

import com.zzz.domain.dto.ChatProcessAggregate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description:
 */
public interface IChatService {

    ResponseBodyEmitter completions(ResponseBodyEmitter emitter, ChatProcessAggregate chatProcess);

}
