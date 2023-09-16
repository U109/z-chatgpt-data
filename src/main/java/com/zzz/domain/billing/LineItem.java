package com.zzz.domain.billing;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 消耗列表数据
 */
@Data
public class LineItem {
    /**
     * 模型
     */
    private String name;
    /**
     * 金额
     */
    private BigDecimal cost;
}
