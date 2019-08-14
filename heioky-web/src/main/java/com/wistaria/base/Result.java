package com.wistaria.base;

/**
  *  返回结果类
  * @author hanyc
  * @date 2019/8/14
  */
public class Result {

    public static ApiResult success(Object object) {
        ApiResult apiResult = new ApiResult();
        apiResult.setData(object);
        apiResult.setCode(0);
        apiResult.setMsg("成功");
        return apiResult;
    }

    public static ApiResult success() {
        return success(null);
    }

    public static ApiResult error(Integer code, String msg) {
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(code);
        apiResult.setMsg(msg);
        return apiResult;
    }
}
