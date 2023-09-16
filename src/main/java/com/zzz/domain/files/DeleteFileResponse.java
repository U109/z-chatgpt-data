package com.zzz.domain.files;

import lombok.Data;

import java.io.Serializable;
/**
 * @author zhangzhongzhen wrote on 2023/9/11
 * @version 1.0
 * @description: 删除文件应答
 *  {
 *    "id": "file-XjGxS3KTG0uNmNOK362iJua3",
 *    "object": "file",
 *    "deleted": true
 *  }
 */
@Data
public class DeleteFileResponse implements Serializable {

    /** 文件ID */
    private String id;
    /** 对象；file */
    private String object;
    /** 删除；true */
    private boolean deleted;

}
