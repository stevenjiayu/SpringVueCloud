package com.xcode.hjycommunity.common.core.page;


import java.io.Serializable;
import java.util.List;

/**
 * 分頁查詢統一封裝
 */
public class PageResult implements Serializable {


    private static final long serialVersionUID = -5745504245979451144L;
    
    
    /*總紀錄數*/
    private long total;

    /*列表數據*/
    private List<?> rows;

    /*消息狀態*/
    private Integer code;

    /*消息內容*/
    private String msg;

    public PageResult() {
    }

    public PageResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
