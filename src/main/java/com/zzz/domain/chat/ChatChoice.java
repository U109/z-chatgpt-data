package com.zzz.domain.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 对话信息
 */
@Data
public class ChatChoice implements Serializable {

    private long index;
    /** stream = true 请求参数里返回的属性是 delta */
    @JsonProperty("delta")
    private Message delta;
    /** stream = false 请求参数里返回的属性是 delta */
    @JsonProperty("message")
    private Message message;
    @JsonProperty("finish_reason")
    private String finishReason;

}
