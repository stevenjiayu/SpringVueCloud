package com.xcode.hjycommunity.common.core.domain;

import java.io.Serializable;

public class BaseResponse<T> implements Serializable {


    private static final long serialVersionUID = -4590140080172423956L;

    private String code;
    private String messaage;
    private T data;

    public static <T> BaseResponse<T> success(T data){

        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.SUCCESS.getCode());
        response.setMessaage(ResultCode.SUCCESS.getMessage());
        response.setData(data);

        return response;

    }

    public static <T> BaseResponse<T> fail(String message){

        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(ResultCode.ERROR.getCode());
        response.setMessaage(message);


        return response;

    }

    public static <T> BaseResponse<T> fail(String code ,String message){

        BaseResponse<T> response = new BaseResponse<>();
        response.setCode(code);
        response.setMessaage(message);


        return response;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessaage() {
        return messaage;
    }

    public void setMessaage(String messaage) {
        this.messaage = messaage;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
