package com.zzz.domain.images;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 图片响应
 */
@Data
public class ImageResponse implements Serializable {
    /** 条目数据 */
    private List<Item> data;
    /** 创建时间 */
    private long created;
}
