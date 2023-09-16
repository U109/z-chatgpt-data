package com.zzz.domain.other;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 对话信息
 */
@Data
public class Choice implements Serializable {

    private long index;
    private String text;
    private Object logprobs;
    @JsonProperty("finish_reason")
    private String finishReason;

}
