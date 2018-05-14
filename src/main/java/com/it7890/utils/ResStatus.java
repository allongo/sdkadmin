package com.it7890.utils;

/**
 * Created by mingle on 2018/5/8.
 */
public enum ResStatus {
    // 成功
    SUCCESS(0),

    // 失败
    FAIL(-1),

    // 未认证（签名错误）
    UNAUTHORIZED(2),

    // 接口不存在
    NOT_FOUND(3),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR(4);

    public int status;

    ResStatus(int status) {
        this.status = status;
    }
}
