package com.zzz.domain.images;

import lombok.AllArgsConstructor;
import lombok.Getter;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 图片枚举配置
 */
public class ImageEnum {

    @Getter
    @AllArgsConstructor
    public enum Size {
        size_256("256x256"),
        size_512("512x512"),
        size_1024("1024x1024"),
        ;
        private String code;
    }

    @Getter
    @AllArgsConstructor
    public enum ResponseFormat {
        URL("url"),
        B64_JSON("b64_json"),
        ;
        private String code;
    }

}
