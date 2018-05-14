package com.it7890.utils;

/**
 * Created by mingle on 2018/5/8.
 */
public class ResResult<T> {

    public int status;

    public int code;

    private String msg;

    private T data;

    private long runtime;

    public ResResult<T> setStatus(ResStatus resStatus) {
        this.status = resStatus.status;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public ResResult<T> setStatus(int status) {
        this.status = status;
        return this;
    }

    public ResResult<T> setCode(ResCode resCode) {
        this.code = resCode.code;
        return this;
    }

    public int getCode() {
        return code;
    }

    public ResResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public ResResult<T> setMsg(ResMsg resMsg) {
        this.msg = resMsg.msg;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ResResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public long getRuntime(){
        return runtime;
    }

    public ResResult<T> setRuntime(long runtime) {
        this.runtime = runtime;
        return this;
    }
}
