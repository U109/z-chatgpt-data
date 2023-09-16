package com.zzz.domain.chat;

import com.zzz.domain.other.Usage;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 对话请求结果信息
 */
@Data
public class ChatCompletionResponse implements Serializable {

    /** ID */
    private String id;
    /** 对象 */
    private String object;
    /** 模型 */
    private String model;
    /** 对话 */
    private List<ChatChoice> choices;
    /** 创建 */
    private long created;
    /** 耗材 */
    private Usage usage;

}
