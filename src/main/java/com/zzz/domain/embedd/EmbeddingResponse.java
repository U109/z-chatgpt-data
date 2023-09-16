package com.zzz.domain.embedd;

import com.zzz.domain.other.Usage;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 小傅哥，微信：fustack
 * @description
 * @github https://github.com/fuzhengwei
 * @Copyright 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 反馈对象
 */
@Data
public class EmbeddingResponse implements Serializable {

    private String object;
    private List<Item> data;
    private String model;
    private Usage usage;

}
