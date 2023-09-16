package com.zzz.domain.qa;

import com.zzz.domain.other.Choice;
import com.zzz.domain.other.Usage;
import lombok.Data;

import java.io.Serializable;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 金额消耗
 */
@Data
public class QACompletionResponse implements Serializable {

    /** ID */
    private String id;
    /** 对象 */
    private String object;
    /** 模型 */
    private String model;
    /** 对话 */
    private Choice[] choices;
    /** 创建 */
    private long created;
    /** 耗材 */
    private Usage usage;

}
