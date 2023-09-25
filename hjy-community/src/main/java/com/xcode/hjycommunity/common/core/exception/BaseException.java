package com.xcode.hjycommunity.common.core.exception;

public class BaseException extends RuntimeException {


    private String code;
    private String defaultMessage;

    public BaseException(String code, String defaultMessage) {


        super(defaultMessage);
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }
}
