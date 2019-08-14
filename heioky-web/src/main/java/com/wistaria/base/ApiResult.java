package com.wistaria.base;

import lombok.Data;

import java.io.Serializable;

/**
 * api返回结果类
 *
 * @author hanyc
 * @date 2019/8/14
 */
@Data
public class ApiResult<T> implements Serializable {


    private static final long serialVersionUID = 4573371001606137290L;
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}