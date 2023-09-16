package com.zzz.domain.other;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 金额消耗
 */
@Data
public class OpenAiResponse<T> implements Serializable {

    private String object;
    private List<T> data;
    private Error error;


    @Data
    public class Error {
        private String message;
        private String type;
        private String param;
        private String code;
    }

}
