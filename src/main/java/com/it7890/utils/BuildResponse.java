package com.it7890.utils;

/**
 * Created by mingle on 2018/5/8.
 */
public class BuildResponse {

    public static <T> ResResult<T> makeOKRsp(long runtime) {
        return new ResResult<T>().setStatus(ResStatus.SUCCESS).setCode(ResCode.SUCCESS).setMsg(ResMsg.SUCCESS).setRuntime(runtime);
    }

    public static <T> ResResult<T> makeOKRsp(T data, long runtime) {
        return new ResResult<T>().setStatus(ResStatus.SUCCESS).setCode(ResCode.SUCCESS).setMsg(ResMsg.SUCCESS).setData(data).setRuntime(runtime);
    }

    public static <T> ResResult<T> makeErrRsp(int status, int code, String message, long runtime) {
        return new ResResult<T>().setStatus(ResStatus.FAIL).setCode(ResCode.FAIL).setMsg(ResMsg.SUCCESS).setRuntime(runtime);
    }

    public static <T> ResResult<T> makeRsp(int code, String msg, long runtime) {
        return new ResResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> ResResult<T> makeRsp(int code, String msg, T data, long runtime) {
        return new ResResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
