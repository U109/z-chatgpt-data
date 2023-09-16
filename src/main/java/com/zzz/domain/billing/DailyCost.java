package com.zzz.domain.billing;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 金额消耗
 */
@Data
public class DailyCost {
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("line_items")
    private List<LineItem> lineItems;
}
