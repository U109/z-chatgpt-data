package com.zzz.domain.images;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 条目
 */
@Data
public class Item implements Serializable {

    private String url;
    @JsonProperty("b64_json")
    private String b64Json;

}
