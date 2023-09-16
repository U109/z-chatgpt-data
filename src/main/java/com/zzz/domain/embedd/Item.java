package com.zzz.domain.embedd;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 条目信息
 */
@Data
public class Item implements Serializable {

    private String object;
    private List<BigDecimal> embedding;
    private Integer index;

}
