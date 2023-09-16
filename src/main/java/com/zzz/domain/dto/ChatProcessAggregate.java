package com.zzz.domain.dto;

import com.zzz.domain.dto.MessageEntity;
import com.zzz.domain.enums.ChatGPTModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class ChatProcessAggregate {

    /** 验证信息 */
    private String token;
    /** 默认模型 */
    private String model = ChatGPTModel.GPT_3_5_TURBO.getCode();
    /** 问题描述 */
    private List<MessageEntity> messages;

}
