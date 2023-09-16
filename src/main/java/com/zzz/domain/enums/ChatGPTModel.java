package com.zzz.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author zhangzhongzhen wrote on 2023/9/16
 * @version 1.0
 * @description:
 */
@Getter
@AllArgsConstructor
public enum ChatGPTModel {


    /** gpt-3.5-turbo */
    GPT_3_5_TURBO("gpt-3.5-turbo");


    private final String code;


}
