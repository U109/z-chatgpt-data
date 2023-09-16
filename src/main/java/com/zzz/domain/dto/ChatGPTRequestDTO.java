package com.zzz.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import  com.zzz.domain.enums.ChatGPTModel;

import java.util.List;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatGPTRequestDTO {

    /** 默认模型 */
    private String model = ChatGPTModel.GPT_3_5_TURBO.getCode();

    /** 问题描述 */
    private List<MessageEntity> messages;

}
