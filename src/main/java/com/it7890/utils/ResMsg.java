package com.it7890.utils;

/**
 * Created by mingle on 2018/5/8.
 */
public enum ResMsg {

    // 成功
    SUCCESS("success"),

    // 失败
    FAIL("fail"),

    // 未认证（签名错误）
    UNAUTHORIZED("签名错误"),

    // 接口不存在
    NOT_FOUND("接口不存在"),

    // 服务器内部错误
    INTERNAL_SERVER_ERROR("服务器内部错误");

    public String msg;

    ResMsg(String msg) {
        this.msg = msg;
    }

}
