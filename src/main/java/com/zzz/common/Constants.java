package com.zzz.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 通用类
 */
public class Constants {

    /**
     * 官网支持的请求角色类型；system、user、assistant
     * <a href="https://platform.openai.com/docs/guides/chat/introduction">...</a>
     */
    public enum Role {

        SYSTEM("system"),
        USER("user"),
        ASSISTANT("assistant"),
        ;

        private String code;

        Role(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        TOKEN_ERROR("0003", "权限拦截");

        private String code;
        private String info;

    }


}
