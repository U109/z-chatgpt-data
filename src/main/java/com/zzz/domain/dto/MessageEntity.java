package com.zzz.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description: 问题描述
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MessageEntity {

    private String role;
    private String content;
    private String name;

}
